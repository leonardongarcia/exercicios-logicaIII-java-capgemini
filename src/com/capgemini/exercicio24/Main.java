package com.capgemini.exercicio24;

/*
24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resposta = "S";
        while (resposta.toUpperCase(Locale.ROOT).equals("S")) {
            System.out.print("Informe um número: ");
            int numero = Integer.parseInt(entrada.nextLine());

            if (numero > 0) {
                System.out.printf("O número %d é positivo.%n", numero);
            } else if (numero < 0) {
                System.out.printf("O número %d é negativo.%n", numero);
            } else if (numero == 0) {
                System.out.printf("O número %d é igual a 0.%n", numero);
            }

            System.out.println("Deseja continuar (S/N) ?");
            resposta = entrada.nextLine();
        }
    }
}
