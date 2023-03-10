package com.capgemini.exercicio12;

/*
12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor
    e dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
    do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 45%,
    escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
*/

import java.util.Scanner;

public class Main {


    public static final double PERCENTUAL_IMPOSTOS = 1.45;
    public static final double PERCENTUAL_DISTRIBUIDOR = 1.28;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$");
        double custoFabrica = entrada.nextInt();


        double custoConsumidor = (custoFabrica * PERCENTUAL_IMPOSTOS) * PERCENTUAL_DISTRIBUIDOR;

        System.out.printf("O custo do carro ao consumidor é R$%.2f", custoConsumidor);

    }
}
