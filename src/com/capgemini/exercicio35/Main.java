package com.capgemini.exercicio35;

/*
35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
    Tipo de Cliente Valor do KW/h
    a. (Residência) 0,60;
    b. (Comércio) 0,48;
    c. (Indústria) 1,29.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tipo do cliente: ");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        int tipoCliente = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite a quantidade de KW/h gasta no mês: ");
        double quantidadeGasta = Integer.parseInt(entrada.nextLine());

        double valorConta = 0;

        switch (tipoCliente) {
            case 1 -> valorConta = quantidadeGasta * 0.6;
            case 2 -> valorConta = quantidadeGasta * 0.48;
            case 3 -> valorConta = quantidadeGasta * 1.29;
        }

        System.out.printf("Sua conta está no valor de R$%.2f", valorConta);
    }
}
