package com.emregecer.designpatterns.creational.factorymethod.example1.factory;

import com.emregecer.designpatterns.creational.factorymethod.example1.buttons.Button;

/**
 * Base Creator
 * Base factory class. Note that "factory" is merely a role for the class. It should have some core business logic
 * which needs different products to be created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button objects.
     */
    public abstract Button createButton();
}
