package Lista03;

/*
* Escreva um programa que receba 5 números inteiros, armazene-os em um
array, e imprima na tela os valores em ordem decrescente.*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numerosInteiros = new int[5];

        for (int i = 0; i < numerosInteiros.length; i++) {
            System.out.println("Informe um número inteiro:");
            numerosInteiros[i] = entrada.nextInt();
        }

        int auxiliar;
        for (int i = 0; i < numerosInteiros.length; i++) {
            for (int j = 0; j < numerosInteiros.length; j++) {
                if (numerosInteiros[j] < numerosInteiros[i]){
                    auxiliar = numerosInteiros[i];
                    numerosInteiros[i] = numerosInteiros[j];
                    numerosInteiros[j] = auxiliar;
                }
            }
        }

        for (int i = 0; i < numerosInteiros.length; i++) {
            System.out.print(numerosInteiros[i] + " ");
        }
    }
}
