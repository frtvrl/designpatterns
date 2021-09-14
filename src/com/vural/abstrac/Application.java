package com.vural.abstrac;

import com.vural.abstrac.buttons.Button;
import com.vural.abstrac.checkboxes.Checkbox;
import com.vural.abstrac.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}