package com.capgemini.exercicio22;

/*
22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
    Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
    Informe o valor de custo de cada produto, o valor de venda de cada produto, a média de preço de custo e do preço de venda;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double custoFabrica;
        double valorVenda;
        double totalCusto = 0;
        double totalVenda = 0;
        double mediaCusto;
        double mediavenda;
        int i;
        for (i = 0; i < 40; i++) {

            System.out.print("Digite o custo de fábrica do carro: R$");
            custoFabrica = entrada.nextInt();

            System.out.print("Digite o preço de venda do carro: R$");
            valorVenda = entrada.nextInt();

            if (custoFabrica > valorVenda) {
                System.out.println("PREJUÍZO");
            } else if (custoFabrica < valorVenda) {
                System.out.println("LUCRO!");
            } else {
                System.out.println("EMPATE!");
            }

            System.out.printf("O preço de custo é de R$%.2f %n", custoFabrica);
            System.out.printf("O preço de venda é de R$%.2f %n", valorVenda);

            totalCusto += custoFabrica;
            totalVenda += valorVenda;

        }
        mediaCusto = totalCusto / i;
        mediavenda = totalVenda / i;

        System.out.printf("A média do custo é de R$%.2f %n", mediaCusto);
        System.out.printf("A média de venda é de R$%.2f %n", mediavenda);

    }
}
