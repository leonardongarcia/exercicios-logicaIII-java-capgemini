package com.capgemini.exercicio8;

/*
8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$).
    O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com ousuário;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor em dólar: US$");
        double valorDolar = entrada.nextInt();

        System.out.print("Digite o valor da cotação: R$");
        double cotacao = entrada.nextInt();

        double valorReal = valorDolar * cotacao;

        System.out.printf("UU$%.2f com cotação de R$%.2f é R$%.2f", valorDolar, cotacao, valorReal);

    }
}
