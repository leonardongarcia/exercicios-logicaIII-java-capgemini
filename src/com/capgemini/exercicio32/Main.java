package com.capgemini.exercicio32;

/*
32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
    Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
    Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
    a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
    b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
    c. Triângulo equilátero é também isóscele;
    d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double primeiroLado = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite o segundo lado do triângulo: ");
        double segundoLado = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite o terceiro lado do triângulo: ");
        double terceiroLado = Double.parseDouble(entrada.nextLine());

        if (primeiroLado == segundoLado && primeiroLado == terceiroLado) {
            System.out.println("Triângulo Equilátero");
        } else if (primeiroLado != segundoLado && primeiroLado != terceiroLado && segundoLado != terceiroLado) {
            System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Triângulo Isóscele");
        }

    }
}
