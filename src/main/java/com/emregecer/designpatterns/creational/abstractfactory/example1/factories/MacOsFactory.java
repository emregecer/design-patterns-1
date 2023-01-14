package com.emregecer.designpatterns.creational.abstractfactory.example1.factories;

import com.emregecer.designpatterns.creational.abstractfactory.example1.buttons.Button;
import com.emregecer.designpatterns.creational.abstractfactory.example1.buttons.MacOsButton;
import com.emregecer.designpatterns.creational.abstractfactory.example1.checkboxes.Checkbox;
import com.emregecer.designpatterns.creational.abstractfactory.example1.checkboxes.MacOsCheckbox;

/**
 * Concrete factory (macOS)
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
