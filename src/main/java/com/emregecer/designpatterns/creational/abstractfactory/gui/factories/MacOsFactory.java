package com.emregecer.designpatterns.creational.abstractfactory.gui.factories;

import com.emregecer.designpatterns.creational.abstractfactory.gui.buttons.Button;
import com.emregecer.designpatterns.creational.abstractfactory.gui.buttons.MacOsButton;
import com.emregecer.designpatterns.creational.abstractfactory.gui.checkboxes.Checkbox;
import com.emregecer.designpatterns.creational.abstractfactory.gui.checkboxes.MacOsCheckbox;

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
