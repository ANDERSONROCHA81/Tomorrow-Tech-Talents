package Lista03;

/*
* Escreva um programa que leia 10 valores inteiros e positivos e encontre o
maior valor, o menor valor e calcule a média dos números lidos e exiba
essas informações.*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] valoresInteiros = new int[10];
        int numero;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o %dº número inteiro e positivo:", i + 1);
            numero = entrada.nextInt();
            if (numero >= 0){
                valoresInteiros[i] = numero;
            }else{
                System.out.println("O número deve ser positivo!");
                i--;
            }
        }

        int maiorValor = valoresInteiros[0];
        int menorValor = valoresInteiros[0];
        int soma = 0;
        double media = 0;

        for (int i = 0; i < valoresInteiros.length; i++) {
            if (valoresInteiros[i] > maiorValor){
                maiorValor = valoresInteiros[i];
            }

            if (valoresInteiros[i] < menorValor){
                menorValor = valoresInteiros[i];
            }

            soma += valoresInteiros[i];
        }

        media = (double) soma / valoresInteiros.length;

        System.out.print("Os números lidos foram: ");
        for (int i = 0; i < valoresInteiros.length; i++) {
            System.out.print(valoresInteiros[i] + " ");
        }

        System.out.println();
        System.out.printf("O menor valor lido é %d\n", menorValor);
        System.out.printf("O maior valor lido é %d\n", maiorValor);
        System.out.printf("A média de todos os valores lidos é %.2f\n", media);
    }
}
