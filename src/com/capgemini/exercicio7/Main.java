package com.capgemini.exercicio7;

/*
7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
    A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = entrada.nextInt();

        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        System.out.printf("%.1f° Celsius convertida em Fahrenheit é %.1f°", temperaturaCelsius, temperaturaFahrenheit);

    }
}
