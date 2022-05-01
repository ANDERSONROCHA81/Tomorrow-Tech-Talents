package Lista06;

/*
* Faça um Programa para uma loja de tintas. O programa deverá
pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 6 metros
quadrados e que a tinta é vendida em latas de 18 litros, que
custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e
os respectivos preços em 2 situações:
a. comprar apenas latas de 18 litros;
b. comprar apenas galões de 3,6 litros;*/

import java.util.Scanner;

public class Exercicio06 {
    static final int CAPACIDADE_DE_COBERTURA_DA_LATA = 18 * 6;
    static final double PRECO_DA_LATA = 80;
    static final double CAPACIDADE_DE_COBERTURA_DO_GALAO = 3.6 * 6;
    static final double PRECO_DO_GALAO = 25;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tamanho, em m², da área a ser pintada:");
        int areaASerPintada = entrada.nextInt();

        double qtdLatas = Math.ceil((double) areaASerPintada / CAPACIDADE_DE_COBERTURA_DA_LATA);
        double precoTotalLatas = qtdLatas * PRECO_DA_LATA;

        double qtdGaloes = Math.ceil((double) areaASerPintada / CAPACIDADE_DE_COBERTURA_DO_GALAO);
        double precoTotalGaloes = qtdGaloes * PRECO_DO_GALAO;

        System.out.printf("A quantidade de latas de tinta necessárias para pintar %d m² de área é de %.0f lata(s)\n", areaASerPintada, qtdLatas);
        System.out.printf("O preço total para pintar esse área é de R$ %.2f\n", precoTotalLatas);

        System.out.printf("A quantidade de galões de tinta necessários para pintar %d m² de área é de %.0f galõe(s)\n", areaASerPintada, qtdGaloes);
        System.out.printf("O preço total para pintar esse área é de R$ %.2f\n", precoTotalGaloes);
    }
}
