package Lista06;

/*
* Faça um programa para uma loja de tintas. O programa deverá
pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros
quadrados e que a tinta é vendida em latas de 18 litros, que
custam R$ 80,00. Informe ao usuário a quantidade de latas de
tinta a serem compradas e o preço total.*/

import java.util.Scanner;

public class Exercicio02 {
   static final int CAPACIDADE_DA_LATA = 18;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tamanho, em m², da área a ser pintada:");
        int areaASerPintada = entrada.nextInt();

        double qtdLatas = Math.ceil((double) areaASerPintada / CAPACIDADE_DA_LATA);
        double precoTotal = qtdLatas * 80;

        System.out.printf("A quantidade de latas de tintas necessárias para pintar %d m² de área é de %.0f latas\n", areaASerPintada, qtdLatas);
        System.out.printf("O preço total para pintar esse área é de R$ %.2f\n", precoTotal);
    }
}
