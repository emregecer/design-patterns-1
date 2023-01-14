package com.emregecer.designpatterns.behavioral.mediator.example1;

import com.emregecer.designpatterns.behavioral.mediator.example1.components.*;
import com.emregecer.designpatterns.behavioral.mediator.example1.mediator.Editor;
import com.emregecer.designpatterns.behavioral.mediator.example1.mediator.Mediator;

import javax.swing.*;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
