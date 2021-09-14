package com.vural.abstrac.factories;


import com.vural.abstrac.buttons.Button;
import com.vural.abstrac.checkboxes.Checkbox;

/**
 * abstrac factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}