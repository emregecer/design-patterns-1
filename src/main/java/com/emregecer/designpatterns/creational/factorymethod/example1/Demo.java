package com.emregecer.designpatterns.creational.factorymethod.example1;

import com.emregecer.designpatterns.creational.factorymethod.example1.factory.Dialog;
import com.emregecer.designpatterns.creational.factorymethod.example1.factory.HtmlDialog;
import com.emregecer.designpatterns.creational.factorymethod.example1.factory.WindowsDialog;

/**
 * Taken from <a href="https://refactoring.guru/design-patterns/factory-method/java/example">Refactoring Guru</a>
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if ("Windows 11".equals(System.getProperty("os.name"))) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
