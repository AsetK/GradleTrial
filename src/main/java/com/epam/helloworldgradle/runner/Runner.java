package com.epam.helloworldgradle.runner;

import com.epam.helloworldgradle.service.PrinterInterface;

import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.ServiceLoader;

public class Runner {

    public static void main(String[] args) {
        String name = args[0];

        ServiceLoader<PrinterInterface> loader = ServiceLoader.load(PrinterInterface.class);
        Iterator<PrinterInterface> iterator = loader.iterator();

        PrinterInterface printer = null;

        if(iterator.hasNext()){
            printer = iterator.next();
        }
        ResourceBundle resourceBundle = ResourceBundle.getBundle("properties.message");
        String message = resourceBundle.getString("greeting");

        printer.print(message + name);
    }
}
