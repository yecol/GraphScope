#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import importlib.util
from pathlib import Path

import pytest


def _load_client_utils_module():
    current = Path(__file__).resolve()
    repo_root = None
    for candidate in current.parents:
        if (candidate / "VERSION").exists() and (candidate / "flex").exists():
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


@pytest.fixture(scope="module")
def client_utils():
    return _load_client_utils_module()


def test_input_format_enum_values_are_stable(client_utils):
    InputFormat = client_utils.InputFormat
    assert InputFormat.CPP_ENCODER.value == 0
    assert InputFormat.CYPHER_JSON.value == 1
    assert InputFormat.CYPHER_PROTO_ADHOC.value == 2
    assert InputFormat.CYPHER_PROTO_PROCEDURE.value == 3


@pytest.fixture(
    params=[
        ("hello", "CPP_ENCODER"),
        ("{}", "CYPHER_JSON"),
        ("adhoc_query", "CYPHER_PROTO_ADHOC"),
        ("procedure_call", "CYPHER_PROTO_PROCEDURE"),
        ("", "CPP_ENCODER"),
        ("你好", "CPP_ENCODER"),
        ("你好", "CYPHER_JSON"),
        ("你好", "CYPHER_PROTO_ADHOC"),
        ("你好", "CYPHER_PROTO_PROCEDURE"),
    ]
)
def payload_and_format(request, client_utils):
    payload, format_name = request.param
    return payload, getattr(client_utils.InputFormat, format_name)


def test_append_format_byte_appends_expected_format_suffix(
    payload_and_format, client_utils
):
    payload, input_format = payload_and_format
    result = client_utils.append_format_byte(payload, input_format=input_format)
    assert result[:-1] == payload.encode()
    assert result[-1] == input_format.value


def test_append_format_byte_rejects_bytes_input(client_utils):
    with pytest.raises(TypeError):
        client_utils.append_format_byte(
            b"hello", input_format=client_utils.InputFormat.CPP_ENCODER
        )


def test_append_format_byte_rejects_none_input_format(client_utils):
    with pytest.raises(AttributeError):
        client_utils.append_format_byte("hello", input_format=None)


@pytest.mark.parametrize("bad_input_format", [1, "cpp"])
def test_append_format_byte_rejects_non_enum_input_format(client_utils, bad_input_format):
    with pytest.raises(AttributeError):
        client_utils.append_format_byte("hello", input_format=bad_input_format)
