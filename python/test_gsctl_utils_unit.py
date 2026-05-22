#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import importlib.util
import sys
import types
from pathlib import Path


def _load_utils_module(monkeypatch):
    graphscope = types.ModuleType("graphscope")
    flex = types.ModuleType("graphscope.flex")
    rest = types.ModuleType("graphscope.flex.rest")

    class PrimitiveType:
        def __init__(self, primitive_type):
            self.primitive_type = primitive_type

    class StringType:
        pass

    rest.PrimitiveType = PrimitiveType
    rest.StringType = StringType

    treelib = types.ModuleType("treelib")

    class Node:
        pass

    class Tree:
        def create_node(self, *args, **kwargs):
            return None

    treelib.Node = Node
    treelib.Tree = Tree

    monkeypatch.setitem(sys.modules, "graphscope", graphscope)
    monkeypatch.setitem(sys.modules, "graphscope.flex", flex)
    monkeypatch.setitem(sys.modules, "graphscope.flex.rest", rest)
    monkeypatch.setitem(sys.modules, "treelib", treelib)

    file_path = Path(__file__).parent / "graphscope" / "gsctl" / "utils.py"
    spec = importlib.util.spec_from_file_location("gsctl_utils_under_test", file_path)
    module = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(module)
    return module, PrimitiveType, StringType


def test_read_write_yaml_file_roundtrip(tmp_path, monkeypatch):
    utils, _, _ = _load_utils_module(monkeypatch)
    data = {"name": "graphscope", "items": [1, 2, 3], "enabled": True}
    path = tmp_path / "sample.yaml"
    utils.write_yaml_file(data, path)
    assert utils.read_yaml_file(path) == data


def test_is_valid_file_path(tmp_path, monkeypatch):
    utils, _, _ = _load_utils_module(monkeypatch)
    file_path = tmp_path / "file.txt"
    dir_path = tmp_path / "folder"
    file_path.write_text("ok")
    dir_path.mkdir()
    assert utils.is_valid_file_path(file_path)
    assert not utils.is_valid_file_path(dir_path)
    assert not utils.is_valid_file_path(tmp_path / "missing.txt")


def test_terminal_display(capsys, monkeypatch):
    utils, _, _ = _load_utils_module(monkeypatch)
    utils.terminal_display([["a", "bb"], ["ccc", "d"]])
    out = capsys.readouterr().out.strip().splitlines()
    assert out == ["a    bb", "ccc  d"]


def test_parse_property_type(monkeypatch):
    utils, PrimitiveType, StringType = _load_utils_module(monkeypatch)
    tree = utils.TreeDisplay()

    class Property:
        def __init__(self, actual_instance):
            self.actual_instance = actual_instance

    assert tree.parse_property_type(Property(PrimitiveType("DT_SIGNED_INT64"))) == (
        "DT_SIGNED_INT64"
    )
    assert tree.parse_property_type(Property(StringType())) == "string"
    assert tree.parse_property_type(Property(12345)) == "12345"
