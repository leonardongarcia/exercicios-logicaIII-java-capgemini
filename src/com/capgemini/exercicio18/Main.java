package com.capgemini.exercicio18;

/*
18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade”
    e “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
*/

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        var idade = 0;

        System.out.println("Idade de 75 pessoas");

        for (int i = 0; i < 75; i++) {

            idade = random.nextInt(100);
            if (idade >= 18) {
                System.out.printf("Idade %d anos - maior de idade %n", idade );
            } else {
                System.out.printf("Idade %d anos - menor de idade %n", idade);

            }
        }
    }
}
