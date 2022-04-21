package aula04;

/*
* Crie um método que recebe uma matriz bidimensional inteira e um
inteiro que indica uma de suas linhas, e retorna a média dos valores
daquela linha*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        System.out.println("Informe 9 números:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = entrada.nextInt();
            }
        }

        int linha;
        System.out.println("Agora escolha uma linha da matriz 3 x 3 (0, 1 ou 2):");
        while (true){
            linha = entrada.nextInt();
            if (linha == 0 || linha == 1 || linha == 2){
                break;
            }else {
                System.out.println("A linha deve ser 0, 1 ou 2.");
            }
        }

        double media = 0.0;
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i == linha){
                    soma += numeros[linha][j];
                }
            }
        }

        media = (double) soma / numeros.length;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("%d  ", numeros[i][j]);
            }
            System.out.println();
        }

        System.out.printf("A média dos números da linha %d da matriz é %.2f\n", linha, media);
    }
}
