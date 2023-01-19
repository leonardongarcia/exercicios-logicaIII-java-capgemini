package com.capgemini.exercicio31;

/*
31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere,
    pede-se para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético;
    caso contrário deve ser impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite o terceiro número: ");
        double segundoNumero = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite o operador ('+', '-', '*', ou '/'): ");
        char operador = entrada.nextLine().charAt(0);

        double resultado = 0;

        switch (operador) {
            case '*' -> resultado = primeiroNumero * segundoNumero;
            case '-' -> resultado = primeiroNumero - segundoNumero;
            case '+' -> resultado = primeiroNumero + segundoNumero;
            case '/' -> {
                if (segundoNumero == 0) {
                    System.out.println("Não é possível fazer divisão por 0.");
                } else {
                    resultado = primeiroNumero / segundoNumero;
                }
            }
            default -> System.out.println("O operador não é válido!");
        }

        System.out.printf("%.2f %s %.2f = %.2f", primeiroNumero, operador, segundoNumero, resultado);
    }
}
