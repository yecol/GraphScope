#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import importlib.util
from pathlib import Path

import pytest


def _load_client_utils_module():
    current = Path(__file__).resolve()
    repo_root = None
    for candidate in current.parents:
        if (candidate / ".git").exists():
            repo_root = candidate
            break
    if repo_root is None:
        raise RuntimeError("Cannot locate repository root from test path")
    module_path = (
        repo_root
        / "flex"
        / "interactive"
        / "sdk"
        / "python"
        / "gs_interactive"
        / "client"
        / "utils.py"
    )
    spec = importlib.util.spec_from_file_location("gs_interactive_client_utils", module_path)
    module = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(module)
    return module


CLIENT_UTILS = _load_client_utils_module()
InputFormat = CLIENT_UTILS.InputFormat
append_format_byte = CLIENT_UTILS.append_format_byte


def test_input_format_enum_values_are_stable():
    assert InputFormat.CPP_ENCODER.value == 0
    assert InputFormat.CYPHER_JSON.value == 1
    assert InputFormat.CYPHER_PROTO_ADHOC.value == 2
    assert InputFormat.CYPHER_PROTO_PROCEDURE.value == 3


@pytest.mark.parametrize(
    "payload,input_format",
    [
        ("hello", InputFormat.CPP_ENCODER),
        ("{}", InputFormat.CYPHER_JSON),
        ("adhoc_query", InputFormat.CYPHER_PROTO_ADHOC),
        ("procedure_call", InputFormat.CYPHER_PROTO_PROCEDURE),
        ("", InputFormat.CPP_ENCODER),
        ("你好", InputFormat.CYPHER_JSON),
    ],
)
def test_append_format_byte_appends_expected_format_suffix(payload, input_format):
    result = append_format_byte(payload, input_format=input_format)
    assert result[:-1] == payload.encode()
    assert result[-1] == input_format.value


def test_append_format_byte_rejects_bytes_input():
    with pytest.raises(TypeError):
        append_format_byte(b"hello", input_format=InputFormat.CPP_ENCODER)


@pytest.mark.parametrize("bad_input_format", [None, 1, "cpp"])
def test_append_format_byte_rejects_invalid_input_format(bad_input_format):
    with pytest.raises(AttributeError):
        append_format_byte("hello", input_format=bad_input_format)
