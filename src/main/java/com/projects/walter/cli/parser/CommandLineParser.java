package com.projects.walter.cli.parser;

import com.projects.walter.cli.commands.*;
import com.projects.walter.cli.common.HelpOption;
import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;

import static picocli.CommandLine.Option;

@Command(
        subcommands = {CopyFilesCommand.class, CreateCommand.class, ListCommand.class, UpdateCommand.class, DeleteCommand.class},
        versionProvider = VersionProvider.class
)
public class CommandLineParser {

    @Mixin
    private HelpOption helpOption;
    @Option(names = {"-v", "--version"}, versionHelp = true, description = "Print version information and exit.")
    private boolean versionHelpRequested;
}
