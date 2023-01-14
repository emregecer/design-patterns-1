package com.emregecer.designpatterns.creational.abstractfactory.gui;

import com.emregecer.designpatterns.creational.abstractfactory.gui.app.Application;
import com.emregecer.designpatterns.creational.abstractfactory.gui.factories.GuiFactory;
import com.emregecer.designpatterns.creational.abstractfactory.gui.factories.MacOsFactory;
import com.emregecer.designpatterns.creational.abstractfactory.gui.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 * Taken from <a href="https://refactoring.guru/design-patterns/abstract-factory/java/example">Refactory Guru</a>
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
