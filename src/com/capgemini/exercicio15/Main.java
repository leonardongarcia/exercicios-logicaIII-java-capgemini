package com.capgemini.exercicio15;

/*
15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();


        if (numero > 100 && numero < 200) {
            System.out.printf("O número %d está entre 100 e 200", numero);
        } else {
            System.out.printf("O número %d não está entre 100 e 200", numero);

        }

    }
}
