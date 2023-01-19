package com.capgemini.exercicio5;

/*
5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
    No final informar o nome do aluno e a sua média (aritmética);
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = entrada.nextLine();

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = entrada.nextInt();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = entrada.nextInt();

        System.out.print("Digite a terceira nota: ");
        int terceiraNota = entrada.nextInt();


        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.printf("O nome do aluno é: %s %n", nomeAluno);
        System.out.printf("O nota média é: %.2f %n", media);

    }
}
