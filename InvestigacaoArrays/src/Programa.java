/*
Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".
Exercício para pŕatica Java Collections - List.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        List<Boolean> lista = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.println("Telefonou para a vítima?");

            System.out.println("Esteve no local do crime?");
            System.out.println("Mora perto da vítima?");
            System.out.println("Devia para a vítima?");
            System.out.println("Já trabalhou com a vítima?");
        }

    }
}
