package aula01;

/*
* Faça um programa que receba o preço de custo do produto e exiba o
valor de venda. O valor de venda receberá um acréscimo de acordo
com o percentual informado pelo usuário.*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o preço de custo do produto:");
        double precoDeCusto = entrada.nextDouble();

        System.out.println("Informe o percentual que será acrescentado ao valor de custo do produto para a sua venda:");
        double percentualDeAcrescimo = entrada.nextDouble() / 100;

        System.out.printf("O valor da venda de um produto que custa R$ %.2f, com um acréscimo de %.2f por cento, é de R$ %.2f\n", precoDeCusto, percentualDeAcrescimo, precoDeCusto + precoDeCusto * percentualDeAcrescimo);
    }
}
