package com.capgemini.exercicio10;

/*
10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros.
    Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;
*/

import java.util.Scanner;

public class Main {

    public static final int QUANTIDADE_PARCELAS = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$");
        double valorCompra = entrada.nextInt();

        double valorPrestacao = valorCompra / QUANTIDADE_PARCELAS;

        System.out.printf("O valor de R$%.2f será parcelado em 3 vezes de R$%.2f", valorCompra, valorPrestacao);

    }
}
