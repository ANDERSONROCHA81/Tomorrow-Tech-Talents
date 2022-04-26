package Lista04;

/*
*  Crie um programa que preencha uma matriz de 3x5 com números
inteiros. Em seguida faça:
a. some cada uma das linhas armazenando o resultado em um
vetor;
b. some cada uma das colunas armazenando o resultado em um
vetor;
c. imprima o resultado da soma das linhas;
d. imprima o resultado da soma das colunas;
e. imprima a matriz completa*/

import java.security.SecureRandom;

public class Exercicio09 {
    public static void main(String[] args) {
        SecureRandom numeroAleatorio = new SecureRandom();

        int[][] numerosInteiros = new int[3][5];
        int[] somaDasLinhas = {0, 0, 0};
        int[] somaDasColunas = {0, 0, 0, 0, 0};

        for (int i = 0; i < numerosInteiros.length; i++) {
            for (int j = 0; j < numerosInteiros[i].length; j++) {
                numerosInteiros[i][j] = numeroAleatorio.nextInt(1, 101);
                somaDasLinhas[i] += numerosInteiros[i][j];
            }
        }

        for (int j = 0; j < numerosInteiros.length; j++) {
            for (int i = 0; i < numerosInteiros[j].length; i++) {
                somaDasColunas[i] += numerosInteiros[j][i];
            }
        }

        System.out.println("A matriz 3 x 5 completa:");

        for (int i = 0; i < numerosInteiros.length; i++) {
            for (int j = 0; j < numerosInteiros[i].length; j++) {
                System.out.printf("%d ", numerosInteiros[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nO vetor da soma das linhas da matriz:");

        for (int i = 0; i < somaDasLinhas.length; i++) {
            System.out.printf("%d ", somaDasLinhas[i]);
        }

        System.out.println("\nO vetor da soma das colunas da matriz:");

        for (int i = 0; i < somaDasColunas.length; i++) {
            System.out.printf("%d ", somaDasColunas[i]);
        }
    }
}
