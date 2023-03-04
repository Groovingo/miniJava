package edu.westminstercollege.cmpt355.minijava;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

    public static void main(String... args) throws IOException {
        var lexer = new MiniJavaLexer(CharStreams.fromFileName("test_input/project2.minijava"));
        var parser = new MiniJavaParser(new CommonTokenStream(lexer));

        var ast = parser.goal().n;

        AST.print(ast);
    }
}
