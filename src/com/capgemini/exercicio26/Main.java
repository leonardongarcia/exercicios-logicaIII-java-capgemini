package com.capgemini.exercicio26;

/*
26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso.
    Caso o usuário digite um número que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1 -> System.out.println("um");
            case 2 -> System.out.println("dois");
            case 3 -> System.out.println("três");
            case 4 -> System.out.println("quatro");
            case 5 -> System.out.println("cinco");
            default -> System.out.println("Número inválido");
        }

    }
}
