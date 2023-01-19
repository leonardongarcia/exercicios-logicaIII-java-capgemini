package com.capgemini.exercicio19;

/*
19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher.
    No final informe total de homens e de mulheres;
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        String sexo;

        int homens = 0;
        int mulheres = 0;

        for (int i = 0; i < 56; i++) {
            System.out.println("Informe o seu nome: ");
            nome = entrada.nextLine();

            System.out.println("Informe o seu sexo M/F: ");
            sexo = entrada.nextLine();

            System.out.printf("O seu nome é %s %n", nome);

            if (sexo.toUpperCase(Locale.ROOT).equals("M")) {
                System.out.println("Você é Homem!");
                homens++;
            } else if (sexo.toUpperCase(Locale.ROOT).equals("F")) {
                System.out.println("Você é Mulher!");
                mulheres++;
            }
        }

        System.out.printf("Há %d homens e %d mulheres", homens, mulheres);
    }
}
