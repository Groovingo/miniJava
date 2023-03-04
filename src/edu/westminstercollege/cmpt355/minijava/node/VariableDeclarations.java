package edu.westminstercollege.cmpt355.minijava.node;

import edu.westminstercollege.cmpt355.minijava.node.TypeNode;

import java.util.ArrayList;
import java.util.List;

public record VariableDeclarations(TypeNode type, List<DeclarationItem> items) implements Statement {

    @Override
    public List<? extends Node> children() {
        var children = new ArrayList<Node>();
        children.add(type);
        children.addAll(items);
        return children;
    }
}
