package application;

import entitie.Candidates;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("/home/juca/Documentos/ExeJava/CollectionsMapExe/files/eleicaoo.txt");
        Scanner sc = new Scanner(System.in);


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            Candidates candidates;
            Map<Candidates, Integer> map = new HashMap<>();
            String line = br.readLine();
            String username;
            Integer votes;

            while (line != null) {  //colocar lógica soma de votos

                String[] fields = line.split(",");
                username = fields[0];
                votes = Integer.valueOf(fields[1]);
                line = br.readLine();
                candidates = new Candidates(username, votes);
                map.put(candidates, votes);
            }
            for(Candidates cand : map.keySet()) {
                System.out.println(cand.getName() + " votes  : " + map.get(cand));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}