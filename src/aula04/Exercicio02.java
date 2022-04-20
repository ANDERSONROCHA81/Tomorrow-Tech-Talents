package aula04;

/*
* Escreva um código Java que leia 10 valores double do teclado e
armazene-os em uma matriz de dimensões 2x5*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] numeros = new double[2][5];

        System.out.println("Informe 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
