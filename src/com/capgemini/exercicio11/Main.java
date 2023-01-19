package com.capgemini.exercicio11;

/*
11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
    Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
*/

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: R$");
        double precoCusto = entrada.nextInt();

        System.out.print("Digite o percentual de acréscimo sobre o preço de custo: ");
        double percentualAcrescimo = entrada.nextInt();

        double valorVenda = precoCusto * ((percentualAcrescimo / 100) + 1);

        System.out.printf("O valor de venda é de R$%.2f", valorVenda);

    }
}
