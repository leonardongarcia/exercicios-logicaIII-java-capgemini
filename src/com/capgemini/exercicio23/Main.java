package com.capgemini.exercicio23;

/*
23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80, menor que 25 ou igual a 40;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = entrada.nextInt();

        if (numero > 80) {
            System.out.printf("O número %d é maior que 80.", numero);
        } else if (numero < 25) {
            System.out.printf("O número %d é menor que 25.", numero);
        } else if (numero == 40) {
            System.out.printf("O número %d é igual a 40.", numero);
        } else {
            System.out.printf("O número %d não é maior que 80, nem menor que 25, nem igual a 40", numero);
        }
    }
}
