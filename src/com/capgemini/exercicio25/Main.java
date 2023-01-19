package com.capgemini.exercicio25;

/*
25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam
    iguais imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o maior,
    e uma mensagem que são diferentes;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = entrada.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.printf("O número %d é igual ao número %d", primeiroNumero, segundoNumero);
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("Os números são diferentes");
            System.out.printf("O número %d é maior que o número %d", primeiroNumero, segundoNumero);
        } else {
            System.out.println("Os números são diferentes");
            System.out.printf("O número %d é menor que o número %d", primeiroNumero, segundoNumero);
        }
    }
}
