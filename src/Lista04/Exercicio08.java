package Lista04;

/*
* Faça um programa para receber um conjunto de 10 valores até 100, e
insira em uma matriz, em seguida você deverá receber um outro valor e
verificar se o elemento existe no conjunto de 10 valores da matriz. Caso
exista você deve imprimir uma mensagem: "O valor existe no conjunto",
caso contrário deverá exibir: "O valor não existe no conjunto".*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] valoresAteCem = new int[2][5];

        for (int i = 0; i < valoresAteCem.length; i++) {
            for (int j = 0; j < valoresAteCem[i].length; j++) {
                while (true){
                    System.out.println("Informe um número inteiro entre 1 e 100:");
                    valoresAteCem[i][j] = entrada.nextInt();
                    if (valoresAteCem[i][j] >= 1 && valoresAteCem[i][j] <= 100){
                        break;
                    }else {
                        System.out.println("O número deve estar entre 1 e 100.");
                    }
                }
            }
        }

        System.out.println("Informe outro valor pra ver se ele se encontra na matriz dos valores informados anteriormente:");
        int outroValor = entrada.nextInt();
        boolean existeValor = false;

        for (int i = 0; i < valoresAteCem.length; i++) {
            for (int j = 0; j < valoresAteCem[i].length; j++) {
                if (valoresAteCem[i][j] == outroValor){
                    System.out.printf("O valor %d existe no conjunto\n", outroValor);
                    existeValor = true;
                    break;
                }
            }
        }
        if (!existeValor){
            System.out.printf("O valor %d não existe no conjunto\n", outroValor);
        }
    }
}
