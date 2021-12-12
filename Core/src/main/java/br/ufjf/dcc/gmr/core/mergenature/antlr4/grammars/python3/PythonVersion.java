package br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3;

public enum PythonVersion {
    Autodetect(0),
    Python2(2),
    Python3(3);

    private final int value;

    PythonVersion(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}