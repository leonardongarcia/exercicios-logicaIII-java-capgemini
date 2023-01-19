package com.capgemini.exercicio17;

/*
17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive);
*/

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int contador = 0;
        for (int i = 0; i < 80; i++) {

            var numero = random.nextInt(500);
            System.out.print(numero + " ");
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        System.out.println();
        System.out.printf("Há %d números entre 10 e 150", contador);
    }
}
