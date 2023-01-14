package com.emregecer.designpatterns.creational.abstractfactory.gui.factories;

import com.emregecer.designpatterns.creational.abstractfactory.gui.buttons.Button;
import com.emregecer.designpatterns.creational.abstractfactory.gui.checkboxes.Checkbox;

/**
 * Abstract Factory:
 * Abstract factory knows about all (abstract) product types.
 */
public interface GuiFactory {

    Button createButton();

    Checkbox createCheckbox();

}
