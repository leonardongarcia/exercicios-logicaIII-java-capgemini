package com.capgemini.exercicio3;

/*
3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total
    percorrida pelo automóvel e o total de combustível gasto;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a distância total percorrida: ");
        double distanciaPercorrida = entrada.nextDouble();

        System.out.print("Digite o total de combustível gasto: ");
        double combustivelGasto = entrada.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("O consumo médio do carro é de %.2fkm/litro", consumoMedio);

    }
}
