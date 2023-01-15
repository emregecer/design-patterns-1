package com.emregecer.designpatterns.behavioral.memento.example1.commands.commands;

import com.emregecer.designpatterns.behavioral.memento.example1.editor.Editor;
import com.emregecer.designpatterns.behavioral.memento.example1.shapes.Shape;

import java.awt.*;

public class ColorCommand implements Command {

    private final Editor editor;
    private final Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
