package com.capgemini.exercicio13;

/*
13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero > 10) {
            System.out.printf("O número %d é maior que 10", numero);
        } else {
            System.out.printf("O número %d não é maior que 10", numero);
        }

    }
}
