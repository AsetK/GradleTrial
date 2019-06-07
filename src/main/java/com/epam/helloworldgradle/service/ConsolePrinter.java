package com.epam.helloworldgradle.service;

public class ConsolePrinter implements PrinterInterface {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
