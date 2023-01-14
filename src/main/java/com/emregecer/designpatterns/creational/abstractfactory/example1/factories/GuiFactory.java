package com.emregecer.designpatterns.creational.abstractfactory.example1.factories;

import com.emregecer.designpatterns.creational.abstractfactory.example1.buttons.Button;
import com.emregecer.designpatterns.creational.abstractfactory.example1.checkboxes.Checkbox;

/**
 * Abstract Factory:
 * Abstract factory knows about all (abstract) product types.
 */
public interface GuiFactory {

    Button createButton();

    Checkbox createCheckbox();

}
