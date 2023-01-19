package com.capgemini.exercicio27;

/*
27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto.
    Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.
    O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%,
    gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados.
    Informe total de desconto e total pago pelos clientes;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorTotal;
        double valorDesconto = 0;
        double totalDesconto = 0;
        double totalVendas = 0;
        int combustivel;
        double valorVeiculo = 1;

        while (valorVeiculo > 0) {

            System.out.println("Informe o valor do veículo: ");
            valorVeiculo = entrada.nextDouble();

            if (valorVeiculo == 0) {
                break;
            }

            System.out.println("Informe o combustível do veículo: ");
            System.out.println("1 - alccol ");
            System.out.println("2 - gasolina ");
            System.out.println("3 - diesel ");

            combustivel = entrada.nextInt();


            switch (combustivel) {
                case 1 -> valorDesconto = valorVeiculo * 0.25;

                case 2 -> valorDesconto = valorVeiculo * 0.21;

                case 3 -> valorDesconto = valorVeiculo * 0.14;
            }


            valorTotal = valorVeiculo - valorDesconto;

            totalDesconto += valorDesconto;

            totalVendas += valorTotal;

            entrada.nextLine();
        }

        System.out.printf("Valor total de descontos é de: R$%.2f %n", totalDesconto);
        System.out.printf("Valor total pago pelos clientes é de: R$%.2f %n", totalVendas);
    }
}
