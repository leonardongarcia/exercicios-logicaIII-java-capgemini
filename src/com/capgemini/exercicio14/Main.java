package com.capgemini.exercicio14;

/*
14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = entrada.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.printf("O número %d é maior que o número %d", primeiroNumero, segundoNumero);
        } else {
            System.out.printf("O número %d é menor que o número %d", primeiroNumero, segundoNumero);
        }

    }
}
