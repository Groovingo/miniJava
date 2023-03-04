package edu.westminstercollege.cmpt355.minijava.node;

import java.util.List;

public record PostIncrement(Expression target, String op) implements Expression {

    @Override
    public String getNodeDescription() {
        return String.format("PostIncrement [op: %s]", op);
    }

    @Override
    public List<? extends Node> children() {
        return List.of(target);
    }
}
