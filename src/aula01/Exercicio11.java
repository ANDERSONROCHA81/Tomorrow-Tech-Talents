package aula01;

/*
* Uma loja está vendendo seus produtos em 5 prestações sem juros. Faça
um programa que insira o valor total de uma compra e o valor das
prestações.*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor total das compras:");
        double valorTotal = entrada.nextDouble();

        System.out.printf("A compra de R$ %.2f será dividida em 5 prestações de R$ %.2f sem juros\n", valorTotal, valorTotal / 5);
    }
}
