package com.capgemini.exercicio28;

/*
28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo com os seguintes critérios:
    a. 50% para aqueles que ganham menos do que três salários mínimos;
    b. 20% para aqueles que ganham entre três até dez salários mínimos;
    c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
    d. 10% para os demais funcionários.

    Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado.
    Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        String nomeFuncionario = entrada.nextLine();

        System.out.println("Informe o salário do funcionário: ");
        double salario = entrada.nextDouble();

        System.out.println("Informe o valor do salário mínimo: ");
        double salarioMinimo = entrada.nextDouble();

        double reajuste;
        double aumentoEmpresa = 0;

        if (salarioTresVezesMenorQueSalarioMinimo(salario, salarioMinimo)) {
            reajuste = 50;
            aumentoEmpresa += calcularReajuste(salario, reajuste);
            salario += calcularReajuste(salario, reajuste);

        } else if (salarioEntreTresEDezSalariosMinimos(salario, salarioMinimo)) {
            reajuste = 20;
            aumentoEmpresa += calcularReajuste(salario, reajuste);
            salario += calcularReajuste(salario, reajuste);

        } else if (salarioEntreDezEVinteSalariosMinimos(salario, salarioMinimo)) {
            reajuste = 15;
            aumentoEmpresa += calcularReajuste(salario, reajuste);
            salario += calcularReajuste(salario, reajuste);
        } else {
            reajuste = 10;
            aumentoEmpresa += calcularReajuste(salario, reajuste);
            salario += calcularReajuste(salario, reajuste);
        }

        System.out.printf("O funcionário %s teve um reajuste de %.0f%% e terá um novo salário de %.2f %n", nomeFuncionario, reajuste, salario);
        System.out.printf("A empresa terá um aumento de %.2f na sua folha de pagamento", aumentoEmpresa);

    }

    private static double calcularReajuste(double salario, double reajuste) {
        return salario * (reajuste / 100);
    }

    private static boolean salarioEntreDezEVinteSalariosMinimos(double salario, double salarioMinimo) {
        return salario < (20 * salarioMinimo);
    }

    private static boolean salarioEntreTresEDezSalariosMinimos(double salario, double salarioMinimo) {
        return salario < (10 * salarioMinimo);
    }

    private static boolean salarioTresVezesMenorQueSalarioMinimo(double salario, double salarioMinimo) {
        return salario < (3 * salarioMinimo);
    }
}
