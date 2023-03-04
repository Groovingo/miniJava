package edu.westminstercollege.cmpt355.minijava.node;

import edu.westminstercollege.cmpt355.minijava.node.TypeNode;

import java.util.List;

public record Cast(TypeNode targetType, Expression expression) implements Expression {

    @Override
    public List<? extends Node> children() {
        return List.of(targetType, expression);
    }
}
