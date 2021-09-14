package com.vural.factory;

import com.vural.factory.dialog.Dialog;
import com.vural.factory.dialog.HtmlDialog;
import com.vural.factory.dialog.WindowsDialog;

/**
 * FactoryMethodDemo1 class. Everything comes together here.
 */
public class FactoryMethodDemo1 {
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
        if (System.getProperty("os.name").equals("Windows 10")) {
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