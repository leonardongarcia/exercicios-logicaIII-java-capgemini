package com.capgemini.exercicio6;

/*
6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir
 o valor da variável B e a variável B passe a possuir o valor da variável A.Apresentar os valores trocados;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da variável A: ");
        int A = entrada.nextInt();

        System.out.print("Digite o valor da variável B: ");
        int B = entrada.nextInt();

        System.out.printf("O valor primário de A é: %s %n", A);
        System.out.printf("O valor primário de B é: %s %n", B);

        int aux = 0;

        aux = A;
        A = B;
        B = aux;

        System.out.printf("O valor invertido de A é: %s %n", A);
        System.out.printf("O valor invertido de B é: %s %n", B);

    }
}
