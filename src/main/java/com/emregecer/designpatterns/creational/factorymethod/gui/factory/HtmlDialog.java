package com.emregecer.designpatterns.creational.factorymethod.gui.factory;

import com.emregecer.designpatterns.creational.factorymethod.gui.buttons.Button;
import com.emregecer.designpatterns.creational.factorymethod.gui.buttons.HtmlButton;

/**
 * Concrete Creator
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
