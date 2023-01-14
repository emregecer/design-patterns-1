package com.emregecer.designpatterns.creational.factorymethod.gui;

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
