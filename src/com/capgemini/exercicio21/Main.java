package com.capgemini.exercicio21;

/*
21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e
    informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais;
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        String sexo;
        String saude;
        int idade;

        int apto = 0;

        String resposta = "S";
        while (resposta.toUpperCase(Locale.ROOT).equals("S")) {
            System.out.println("Informe o seu nome: ");
            nome = entrada.nextLine();

            System.out.println("Informe o seu sexo M/F: ");
            sexo = entrada.nextLine();

            System.out.println("Informe a sua idade: ");
            idade = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Informe a sua saude (boa/ruim):  ");
            saude = entrada.nextLine();


            if (podeServir(sexo, saude, idade)) {
                apto++;
            }

            System.out.println("Deseja continuar (S/N) ?");
            resposta = entrada.nextLine();
        }

        System.out.printf("Há %d homens aptos a servir o exército", apto);
    }

    private static boolean podeServir(String sexo, String saude, int idade) {
        return sexo.toUpperCase(Locale.ROOT).equals("M") && idade >= 18 && saude.toUpperCase(Locale.ROOT).equals("BOA");
    }
}