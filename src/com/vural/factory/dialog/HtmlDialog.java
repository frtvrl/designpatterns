package com.vural.factory.dialog;

import com.vural.factory.button.Button;
import com.vural.factory.button.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}