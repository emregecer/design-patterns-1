package com.emregecer.designpatterns.creational.factorymethod.gui;

/**
 * One more concrete creator
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
