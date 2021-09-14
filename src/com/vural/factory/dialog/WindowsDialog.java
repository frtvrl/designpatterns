package com.vural.factory.dialog;

import com.vural.factory.button.Button;
import com.vural.factory.button.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}