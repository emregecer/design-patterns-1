package com.emregecer.designpatterns.creational.abstractfactory.example1.app;

import com.emregecer.designpatterns.creational.abstractfactory.example1.buttons.Button;
import com.emregecer.designpatterns.creational.abstractfactory.example1.checkboxes.Checkbox;
import com.emregecer.designpatterns.creational.abstractfactory.example1.factories.GuiFactory;

/**
 * Client Code
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GuiFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
