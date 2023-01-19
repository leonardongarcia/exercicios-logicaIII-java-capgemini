package com.capgemini.exercicio2;

/*
2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
multiplicação e a divisão dos dois números lidos;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = entrada.nextInt();

        double soma = primeiroNumero + segundoNumero;
        double subtracao = primeiroNumero - segundoNumero;
        double multiplicacao = primeiroNumero * segundoNumero;
        double divisao = primeiroNumero / segundoNumero;

        System.out.printf("%.2f + %.2f = %.2f %n", primeiroNumero, segundoNumero, soma);
        System.out.printf("%.2f - %.2f = %.2f %n", primeiroNumero, segundoNumero, subtracao);
        System.out.printf("%.2f * %.2f = %.2f %n", primeiroNumero, segundoNumero, multiplicacao);
        System.out.printf("%.2f / %.2f = %.2f %n", primeiroNumero, segundoNumero, divisao);

    }
}
