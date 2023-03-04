package edu.westminstercollege.cmpt355.minijava.node;

import java.util.List;

public record Assignment(Expression target, Expression value) implements Expression {

    @Override
    public List<? extends Node> children() {
        return List.of(target, value);
    }
}
