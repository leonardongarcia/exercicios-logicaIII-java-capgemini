package com.capgemini.exercicio4;

/*
4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no
    mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
    informar o seu nome, o salário fixo e salário no final do mês;
*/

import java.util.Scanner;

public class Main {

    public static final double PORCENTAGEM_COMISSAO = 0.15;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = entrada.nextLine();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = entrada.nextDouble();

        System.out.print("Digite o total de vendas em dinheiro: ");
        double vendas = entrada.nextDouble();

        double salarioFinal = salarioFixo + (vendas * PORCENTAGEM_COMISSAO);

        System.out.printf("O nome do vendedor é: %s %n", nomeVendedor);
        System.out.printf("O salário fixo é: %.2f %n", salarioFixo);
        System.out.printf("O salário final é: %.2f %n", salarioFinal);

    }
}
