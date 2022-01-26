package br.ufjf.dcc.gmr.core.mergenature.antlr4;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java9.Java9Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3.PythonLexer;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author João Pedro Lima
 */
public class SyntaxStructure {

    private int startLine;
    private int stopLine;
    private int startCharIndex;
    private int stopCharIndex;
    private String structureType;
    private String text;
    private int id;

    public SyntaxStructure(Token start, Token stop, String structureType, String text) {
        this.startLine = start.getLine();
        this.stopLine = stop.getLine();
        this.startCharIndex = start.getStartIndex();
        this.stopCharIndex = stop.getStopIndex();
        this.structureType = structureType;
        this.text = text;
    }

    public SyntaxStructure(Token token, boolean warning, Language language) {
        this.startLine = token.getLine();
        this.stopLine = (token.getLine() + token.getText().split("\n").length - 1);
        this.startCharIndex = token.getStartIndex();
        this.stopCharIndex = token.getStopIndex();
        if (language == Language.JAVA) {
            if (token.getType() == Java9Lexer.MULTI_LINE_COMMENT) {
                this.structureType = "MultiLineComment";
            } else if (token.getType() == Java9Lexer.LINE_COMMENT) {
                this.structureType = "LineComment";
            }
        } else if (language == Language.CPP) {
            if (token.getType() == CPP14Lexer.BlockComment) {
                this.structureType = "MultiLineComment";
            } else if (token.getType() == CPP14Lexer.LineComment) {
                this.structureType = "LineComment";
            }
        } else if (language == Language.PYTHON) {
            if (token.getType() == PythonLexer.COMMENT) {
                this.structureType = "LineComment";
            } else if (token.getType() == PythonLexer.MULTI_LINE_COMMENT){
                this.structureType = "MultiLineComment";
            }
            if (token.getType() == PythonLexer.MULTI_LINE_COMMENT) {
                this.structureType = "MultiLineComment";
            }

        } else {
            this.structureType = "Unknown";
        }
        this.text = token.getText();
    }

    public SyntaxStructure() {

    }

    public int getStartLine() {
        return startLine;
    }

    public void setStartLine(int startLine) {
        this.startLine = startLine;
    }

    public int getStopLine() {
        return stopLine;
    }

    public void setStopLine(int stopLine) {
        this.stopLine = stopLine;
    }

    public int getStartCharIndex() {
        return startCharIndex;
    }

    public void setStartCharIndex(int startCharIndex) {
        this.startCharIndex = startCharIndex;
    }

    public int getStopCharIndex() {
        return stopCharIndex;
    }

    public void setStopCharIndex(int stopCharIndex) {
        this.stopCharIndex = stopCharIndex;
    }

    public String getStructureType() {
        return structureType;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOneLine() {
        if (startLine == stopLine) {
            return true;
        }
        return false;
    }

    public String getForm() {
        String result = "STRUCTURE TYPE: " + this.getStructureType()
                + "\nSTART LINE: " + this.startLine
                + "\nSTOP LINE: " + this.stopLine
                + "\nSTART CHAR INDEX: " + this.startCharIndex
                + "\nSTOP CHAR INDEX: " + this.stopCharIndex
                + "\nTEXT:\n" + this.text;
        return result;
    }

}
