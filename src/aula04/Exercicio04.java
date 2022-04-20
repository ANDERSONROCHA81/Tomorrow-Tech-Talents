package aula04;

/*
* Crie um método que recebe uma matriz de inteiros e retorna a soma de
todos os elementos da matriz.*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        System.out.println("Informe 9 números:");

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = entrada.nextInt();
                soma += numeros[i][j];
            }
        }

        System.out.printf("A soma de todos os elementos da matriz é %d\n", soma);
    }
}
