package com.projects.walter.cli.commands;

import org.apache.commons.io.FileUtils;
import picocli.CommandLine;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

@CommandLine.Command(name = "backup", description = "a command to automatically move folders into a designated folder")
public class BackupCommand implements Runnable{
    @CommandLine.Option(names = "-chosenDir", split = ",", description = "the path to the dirs that you want to backup")
    private File[] chosenDirs;
    @CommandLine.Option(names = "-backupDir", description = "the path to the dir that will store those files")
    private File backupDir;

    public void run() {
        try {
            if (!backupDir.exists()) {
                throw new NoSuchFileException("the path: " + backupDir + "doesn't exist");
            }
            if (chosenDirs != null && chosenDirs.length > 0) {
                for (File dir : chosenDirs) {
                    try {
                        File newBackupDir;
                        if (backupDir.toString().charAt(backupDir.toString().length() -1) == '/') {
                            newBackupDir = new File(backupDir.toString() + "backup");
                        } else {
                            newBackupDir = new File(backupDir.toString() + "/backup");
                        }
                        FileUtils.copyDirectoryToDirectory(dir, newBackupDir);
                        System.out.println("Arquivo copiado com sucesso: " + dir);
                    } catch (IOException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                System.out.println("Backup criado com sucesso! caminho: " + backupDir.toString() + "/backup");
            }

        } catch (NoSuchFileException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
