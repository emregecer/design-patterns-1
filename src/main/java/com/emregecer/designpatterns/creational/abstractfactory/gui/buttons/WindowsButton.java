package com.emregecer.designpatterns.creational.abstractfactory.gui.buttons;

/**
 * All products families have the same varieties (macOS/Windows).
 * This is another variant of a button.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
