package Lista06;

/*
* Em uma competição de salto em distância cada atleta tem direito
a cinco saltos. No final da série de saltos de cada atleta, o melhor
e o pior resultados são eliminados. O seu resultado fica sendo a
média dos três valores restantes. Você deve fazer um programa
que receba o nome e as cinco distâncias alcançadas pelo atleta
em seus saltos e depois informe a média dos saltos conforme a
descrição acima informada (retirar o melhor e o pior salto e
depois calcular a média). Faça uso de uma lista para armazenar
os saltos. Os saltos são informados na ordem da execução,
portanto não são ordenados.
O programa deve ser encerrado quando não for informado o
nome do atleta. A saída do programa deve ser conforme o
exemplo abaixo:
Atleta: João da Silva
Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m
Melhor salto: 6.5 m
Pior salto: 5.3 m
Média dos demais saltos: 5.9 m
Resultado final:
Rodrigo Curvêllo: 5.9 m*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    static final int QTD_DE_SALTOS = 5;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] distanciasDosSaltos = new double[QTD_DE_SALTOS];
        double somaDosSaltos = 0;

        System.out.println("Informe o nome do atleta:");
        String nome = entrada.nextLine();

        for (int i = 0; i < QTD_DE_SALTOS; i++) {
            System.out.printf("Informe a distância, em metros, do %dº salto\n", i + 1);
            distanciasDosSaltos[i] = entrada.nextDouble();
        }

        System.out.printf("Atleta: %s\n", nome);
        System.out.printf("Primeiro salto: %.1f m\n", distanciasDosSaltos[0]);
        System.out.printf("Segundo salto: %.1f m\n", distanciasDosSaltos[1]);
        System.out.printf("Terceiro salto: %.1f m\n", distanciasDosSaltos[2]);
        System.out.printf("Quarto salto: %.1f m\n", distanciasDosSaltos[3]);
        System.out.printf("Quinto salto: %.1f m\n", distanciasDosSaltos[4]);

        Arrays.sort(distanciasDosSaltos);

        for (int i = 1; i < QTD_DE_SALTOS - 1; i++) {
            somaDosSaltos += distanciasDosSaltos[i];
        }

        System.out.printf("Melhor salto: %.1f m\n", distanciasDosSaltos[4]);
        System.out.printf("Pior salto: %.1f m\n", distanciasDosSaltos[0]);
        System.out.printf("Média dos demais saltos: %.1f m\n", somaDosSaltos / 3);
        System.out.printf("Resultado final:\n%s: %.1f m\n", nome, somaDosSaltos / 3);
    }
}
