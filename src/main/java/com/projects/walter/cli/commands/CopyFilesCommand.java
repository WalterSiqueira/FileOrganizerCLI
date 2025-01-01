package com.projects.walter.cli.commands;

import org.apache.commons.io.FileUtils;
import picocli.CommandLine;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

@CommandLine.Command(name="move", description = "moves files specified by the user for the destination given")
public class CopyFilesCommand  implements Runnable{
    @CommandLine.Option(names = "-sourceDir", description = "path to the folder that you want to move the files FROM", required = true)
    private File sourceDir;

    @CommandLine.Option(names = "-targetDir", description = "path to the folder that you want the files be moved into", required = true)
    private File targetDir;

    @CommandLine.Option(names = "-extension", description = "the extension of the files you want to move, ex: .mp3, .pdf, .mp4", required = true)
    private String ext;


    public void run() {
        try {
            if (!sourceDir.exists()) {
                throw new NoSuchElementException(sourceDir.toString());
            }
            if (!targetDir.exists()) {
                throw new NoSuchElementException(targetDir.toString());
            }

            File[] files = sourceDir.listFiles(((dir, name) -> name.endsWith(ext)));

            if (files != null && files.length > 0) {
                for (File file : files) {
                    try {
                        File NewTargetDir;
                        if (targetDir.toString().charAt(targetDir.toString().length() -1) == '/') {
                            NewTargetDir = new File(targetDir.toString() + "temp");
                        } else {
                            NewTargetDir = new File(targetDir.toString() + "/temp");
                        }
                        FileUtils.moveFileToDirectory(file, NewTargetDir, true);
                        System.out.println("movido: " + file.getName());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else {
                System.out.println("Nenhum arquivo com a extensão " + ext + " foi encontrado no diretório informado!");
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
