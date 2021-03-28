package com.sda.strings;

import java.util.Locale;

public class TextUpperCase implements StringOperation{
    @Override
    public String modify(String text) {
        return text.toUpperCase(Locale.ROOT);
    }
}
