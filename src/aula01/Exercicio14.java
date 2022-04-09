package aula01;

/*
* Escreva um programa para ler o raio de um círculo, calcular e escrever o
valor da área:
○ Cálculo: área = PI * (raio²)*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do raio de um círculo:");
        double raio = entrada.nextDouble();

        System.out.printf("O valor da área de um círculo de raio %.2f é de %.2f\n", raio, Math.PI * Math.pow(raio, 2));
    }
}
