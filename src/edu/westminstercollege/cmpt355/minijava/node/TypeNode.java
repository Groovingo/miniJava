package edu.westminstercollege.cmpt355.minijava.node;

import java.util.List;

public record TypeNode(String type) implements Node {

    @Override
    public String getNodeDescription() {
        return String.format("TypeNode [type: %s]", type);
    }

    @Override
    public List<? extends Node> children() {
        return List.of();
    }
}
