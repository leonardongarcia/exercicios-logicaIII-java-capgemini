package com.capgemini.exercicio1;

/*
1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = entrada.nextInt();

        double soma = primeiroNumero + segundoNumero;

        System.out.printf("A soma de %d + %d é iagual a %.2f.", primeiroNumero, segundoNumero, soma);

    }
}
