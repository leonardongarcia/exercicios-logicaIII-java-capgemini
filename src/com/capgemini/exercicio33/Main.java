package com.capgemini.exercicio33;

/*
33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que calcule
    e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
    a. Professor Nível 1 R$12,00 por hora/aula;
    b. Professor Nível 2 R$17,00 por hora/aula;
    c. Professor Nível 3 R$25,00 por hora/aula.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nível do professor: ");
        int nivel = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite as horas trabalhadas: ");
        double horas = Double.parseDouble(entrada.nextLine());

        double salario = 0;

        switch (nivel) {
            case 1 -> salario = horas * 12;
            case 2 -> salario = horas * 17;
            case 3 -> salario = horas * 25;
            default -> System.out.println("Nível inválido!");
        }

        System.out.printf("O salário do professor é de %.2f", salario);
    }
}
