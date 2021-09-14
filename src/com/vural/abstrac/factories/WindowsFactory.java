package com.vural.abstrac.factories;

import com.vural.abstrac.buttons.Button;
import com.vural.abstrac.buttons.WindowsButton;
import com.vural.abstrac.checkboxes.Checkbox;
import com.vural.abstrac.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}