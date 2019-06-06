package com.epam.customtask;

import org.gradle.api.*;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class CustomTask extends DefaultTask{

    private String message;

    @Input
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @TaskAction
    public void print() {
        String value = (String) getProject().getProperties().get("x");
        System.out.println(message + value);
    }
}
