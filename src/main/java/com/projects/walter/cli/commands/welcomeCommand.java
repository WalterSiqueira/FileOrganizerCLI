package com.projects.walter.cli.commands;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "welcome", description = "Says welcome to the user!")
public class welcomeCommand implements Runnable {
    @Option(names="-name", description = "name of the user", required = true)
    private String name;

    @Override
    public void run() {
        System.out.println("Welcome " + name);
    }
    
}
