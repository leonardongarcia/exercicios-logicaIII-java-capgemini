package com.capgemini.exercicio9;

/*
9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
    Considere fixo o juro da poupança em 0,07% a. m;
*/

import java.util.Scanner;

public class Main {

    public static final double PORCENTAGEM_RENDIMENTO = 1.0007;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do depósito: R$");
        double valorDeposito = entrada.nextInt();

        double rendimento = valorDeposito * PORCENTAGEM_RENDIMENTO;

        System.out.printf("O rendimento após um mês sobre o valor depositado de R$%.2f é o total de R$%.2f", valorDeposito, rendimento);

    }
}
