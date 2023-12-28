package com.hyokjun.colour.services.impl;

import com.hyokjun.colour.services.BluePrinter;
import com.hyokjun.colour.services.ColourPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private final BluePrinter bluePrinter;

    public ColourPrinterImpl(BluePrinter bluePrinter) {
        this.bluePrinter = bluePrinter;
    }
    @Override
    public String print() {
        return String.join(", ", bluePrinter.print());
    }
}
