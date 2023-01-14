package com.emregecer.designpatterns.creational.factorymethod.gui.factory;

import com.emregecer.designpatterns.creational.factorymethod.gui.buttons.Button;
import com.emregecer.designpatterns.creational.factorymethod.gui.buttons.WindowsButton;

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
