package com.projects.walter;

import com.projects.walter.cli.parser.CommandLineParser;
import picocli.CommandLine;

public class Application {

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new CommandLineParser());
        
        if (args.length == 0) {
            commandLine.usage(System.out);
            System.exit(0);
        }

        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }
}
