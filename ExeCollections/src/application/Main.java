package application;

/*
    Problema exemplo
        Um site de internet registra um log de acessos dos usuários. Um
        registro de log consiste no nome de usuário (apenas uma palavra) e o
        instante em que o usuário acessou o site no padrão ISO 8601,
        separados por espaço, conforme exemplo. Fazer um programa que leia
        o log de acessos a partir de um arquivo, e daí informe quantos usuários
        distintos acessaram o site.
        */

import entities.LogEntry;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        File file = new File("/home/juca/Documentos/ExeJava/file/listaCollections.txt");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(" ");
                String username = fields[0];

                set.add(new LogEntry(username));

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

