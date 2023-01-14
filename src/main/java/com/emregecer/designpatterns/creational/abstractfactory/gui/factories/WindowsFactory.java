package com.emregecer.designpatterns.creational.abstractfactory.gui.factories;

import com.emregecer.designpatterns.creational.abstractfactory.gui.buttons.Button;
import com.emregecer.designpatterns.creational.abstractfactory.gui.buttons.WindowsButton;
import com.emregecer.designpatterns.creational.abstractfactory.gui.checkboxes.Checkbox;
import com.emregecer.designpatterns.creational.abstractfactory.gui.checkboxes.WindowsCheckbox;

/**
 * Concrete Factory (Windows)
 * Each concrete factory extends basic factory and responsible for creating products of a single variety.
 */
public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
