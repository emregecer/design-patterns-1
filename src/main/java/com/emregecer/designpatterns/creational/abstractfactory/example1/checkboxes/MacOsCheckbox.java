package com.emregecer.designpatterns.creational.abstractfactory.example1.checkboxes;

/**
 * All products families have the same varieties (macOS/Windows).
 * This is a variant of a checkbox.
 */
public class MacOsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
