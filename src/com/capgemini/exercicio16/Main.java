package com.capgemini.exercicio16;

/*
16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
    Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),
    Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = entrada.nextLine();

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double terceiraNota = entrada.nextDouble();


        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.printf("O nome do aluno é: %s %n", nomeAluno);
        System.out.printf("A média foi de %.2f %n", media);

        if (media >= 7) {
            System.out.printf("APROVADO!");
        } else if (media <= 5) {
            System.out.printf("REPROVADO!");
        } else {
            System.out.printf("RECUPERAÇÃO!");

        }
    }
}
