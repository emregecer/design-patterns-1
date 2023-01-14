package com.emregecer.designpatterns.creational.factorymethod.example1.factory;

import com.emregecer.designpatterns.creational.factorymethod.example1.buttons.Button;
import com.emregecer.designpatterns.creational.factorymethod.example1.buttons.HtmlButton;

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
