package edu.westminstercollege.cmpt355.minijava.node;

import java.util.List;

public record BinaryOp(Expression left, Expression right, String op) implements Expression {

    @Override
    public String getNodeDescription() {
        return String.format("BinaryOp [op: %s]", op);
    }

    @Override
    public List<? extends Node> children() {
        return List.of(left, right);
    }
}
