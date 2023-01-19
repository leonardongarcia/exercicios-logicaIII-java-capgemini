package com.capgemini.exercicio20;

/*
20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto.
    Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros.
    O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%.
    O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
    Informar total de carros com ano até 2000 e total geral;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        String resposta = "S";
        double valorTotal = 0;
        double valorDesconto = 0;
        int anoVeiculo;
        double valorVeiculo;

        while (resposta.equals("S")) {

            System.out.println("Informe o ano do veículo: ");
            anoVeiculo = entrada.nextInt();

            System.out.println("Informe o valor do veículo: ");
            valorVeiculo = entrada.nextDouble();

            if (anoVeiculo > 2000) {
                valorDesconto = valorVeiculo * 0.12;
            } else {
                valorDesconto = valorVeiculo * 0.07;
            }

            valorTotal = valorVeiculo - valorDesconto;

            System.out.printf("Valor do desconto é de: R$%.2f %n", valorDesconto);
            System.out.printf("Valor a ser pago: R$%.2f %n", valorTotal);

            entrada.nextLine();
            System.out.println("Deseja continuar calculando? S/N");
            resposta = entrada.nextLine();
        }
    }
}
