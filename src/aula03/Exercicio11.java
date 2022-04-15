package aula03;

/*
* Escreva um programa que receba dois números inteiros e imprima os
números inteiros que estão no intervalo compreendido entre eles.*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe dois números inteiros:");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        System.out.printf("Os números que estão no intervalo entre %d e %d são:\n", numero1, numero2);

        for (int i = numero1 + 1; i < numero2; i++) {
            System.out.print(i + " ");
        }
    }
}
