package com.emregecer.designpatterns.creational.factorymethod.example1.factory;

import com.emregecer.designpatterns.creational.factorymethod.example1.buttons.Button;
import com.emregecer.designpatterns.creational.factorymethod.example1.buttons.WindowsButton;

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
