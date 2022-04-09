package aula01;

/*
* O custo ao consumidor de um carro novo é a soma do custo de fábrica
com a porcentagem do distribuidor e dos impostos. Supondo que a
porcentagem do distribuidor seja de 28% e os impostos de 45%. Escreva
um programa que leia o custo de fábrica e informe o custo ao
consumidor final.*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do custo de fábrica de um carro novo:");
        double valorCustoDeFabrica = entrada.nextDouble();

        System.out.printf("Um carro com custo de fábrica de R$ %.2f, com porcentagem do distribuidor de 28 por cento e dos impostos de 45 por cento, tem um custo final R$ %.2f\n", valorCustoDeFabrica, valorCustoDeFabrica + valorCustoDeFabrica * 0.28 + valorCustoDeFabrica * 0.45);
    }
}
