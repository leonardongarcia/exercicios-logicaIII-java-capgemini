package com.capgemini.exercicio30;

/*
30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.print("Digite o primeiro número: ");
        numeros.add(entrada.nextInt());

        System.out.print("Digite o segundo número: ");
        numeros.add(entrada.nextInt());

        System.out.print("Digite o terceiro número: ");
        numeros.add(entrada.nextInt());

        numeros.stream().sorted().forEach(System.out::println);
    }
}
