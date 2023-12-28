package com.hyokjun.colour.services;

import org.springframework.stereotype.Service;

@Service
public class SpanishBluePrinter implements BluePrinter{

    @Override
    public String print() {
        return "azul";
    }
}
