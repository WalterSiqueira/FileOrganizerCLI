# Projeto File Organizer | File organizer project

## Table of contents | Sumário :

- [Projeto File Organizer | File organizer project](#projeto-file-organizer--file-organizer-project)
  - [Table of contents | Sumário :](#table-of-contents--sumário-)
  - [Dependencies | Dependencias](#dependencies--dependencias)
  - [English version](#english-version)
    - [how to use it:](#how-to-use-it)
    - [how to install:](#how-to-install)
    - [tecnologies used](#tecnologies-used)
    - [author](#author)
  - [Versão em português Brasil](#versão-em-português-brasil)
    - [como utilizar](#como-utilizar)
    - [como instalar](#como-instalar)
    - [tecnologias utilizadas](#tecnologias-utilizadas)
    - [autor](#autor)

## Dependencies | Dependencias
- [java runtime environment](https://www.java.com/)
- [maven](https://maven.apache.org/download.cgi)

## English version
### how to use it:
explanation: the first command receives as argument the path to the folder where the files you want to move are located and another argument with the path to the folder you want the files to be moved into and finally the argument with the extension of the file that you want to move, like .mp3 or .pdf or any other extension.

the backup command receives the path to the folders you want to be in your backup separated by , (comma) inside the same ""(parenthesis), and the argument with the path to the folder you want your backup to be stored. (yes you can insert the path to removable media like flash drives and stuff like that).

- commands list:
    - move -sourceDir="/path/to/your/file/or/folder" -targetDir="/path/to/where/you/want/to/move/it/into" -extension=".mp3"
  
    - backup -chosenDir="/path/to/folder,/path/to/another/folder/,path/to/third/folder" -backupDir="/path/to/backup/folder"
  
### how to install:
1. Download the .jar file in the [release](https://github.com/WalterSiqueira/FileOrganizerCLI/releases/tag/v1.0) section or compile the source code with the command: mvn clean package at the source code folder.
2. create a file .bash (if you use linux or macOS) or .bat(if you use windows) with the code bellow for linux and macOS:

```bash
#!/bin/bash
java -jar /path/to/file/fileorganizer.jar "$@"
```
2.1. Copy the code bellow if you are on windows:
```bat
#echo off
java -jar "C:\path\to\file\fileorganizer.jar" %*
```
3. rename the file you just created with the name fileorgCLI or with however name you want.
4. now type the same name of the file of the step above with the commands in the command list: [how to use it](#how-to-use-it)

### tecnologies used
- java (programming language)
- picocli (java's library for Command line Interfaces creation)
- apache commons io (a library by apache for dealing with files and stuff like that)

### author
- [walter barboza siqueira](https://github.com/WalterSiqueira)


## Versão em português Brasil
### como utilizar


Explicação:

O primeiro comando recebe como argumento o caminho para a pasta onde estão localizados os arquivos que você deseja mover, outro argumento com o caminho para a pasta onde você quer que os arquivos sejam movidos e, por fim, o argumento com a extensão do arquivo que você deseja mover, como .mp3, .pdf ou qualquer outra extensão.

O comando de backup recebe o caminho para as pastas que você deseja incluir no backup, separados por , (vírgula) dentro do mesmo "" (parênteses), e o argumento com o caminho para a pasta onde você deseja que o backup seja armazenado. (Sim, você pode inserir o caminho para mídias removíveis, como pendrives e coisas do tipo).

- lista de comandos:
    - move -sourceDir="/caminho/para/os/arquivos/que/deseja/mover" -targetDir="/caminho/para/onde/quer/mover/os/arquivos" -extension=".mp3"
  
    - backup -chosenDir="/caminho/para/pasta1,/caminho/para/outra/pasta,caminho/para/terceira/pasta" -backupDir="/caminho/para/a/pasta/do/backup"
  
### como instalar
1. Baixe o arquivo .jar na seção de [release](https://github.com/WalterSiqueira/FileOrganizerCLI/releases/tag/v1.0) ou compile o código-fonte com o comando: mvn clean package na pasta do código-fonte.
2. Crie um arquivo .bash (se estiver no linux ou macOS) .bat (se for windows) com o código abaixo para linux e macOS:

```bash
#!/bin/bash
java -jar /caminho/para/arquivo/fileorganizer.jar "$@"
```

2.1. copie o código abaixo para windows:
```bat
#echo off
java -jar "C:\caminho\para\o\arquivo\fileorganizer.jar" %*
```
3. Renomeie o arquivo que você acabou de criar com o nome fileorgCLI ou com o nome que preferir.
4. Agora, digite no terminal o mesmo nome do arquivo do passo acima seguido dos comandos listados na documentação: [como usar](#como-utilizar).
  
### tecnologias utilizadas
- java (linguagem de programação)
- picocli (Biblioteca do java para criação de interfaces de linha de comando)
- apache commons io (biblioteca da apache para lidar com arquivos e pastas e coisas do tipo)

### autor
- [walter barboza siqueira](https://github.com/WalterSiqueira)
