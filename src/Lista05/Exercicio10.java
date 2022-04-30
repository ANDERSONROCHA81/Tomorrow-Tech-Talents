package Lista05;

/*
* Cada espectador de um cinema respondeu a um questionário no qual
constava sua idade e a sua opinião em relação ao filme:
3 - ótimo,
2 - bom,
1 - regular
Faça um programa que receba a idade e a opinião de 5 espectadores e
que calcule e mostre:
● A média das idades das pessoas que responderam ótimo;
● A quantidade de pessoas que respondeu regular;
● A percentagem de pessoas que respondeu “bom” entre todos os
espectadores analisados.*/

import java.util.Scanner;

public class Exercicio10 {
    static final int QTD_ESPECTADORES = 5;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, opiniao, somaDasIdadesOtimo = 0, qtdOtimo = 0, qtdRegular = 0, qtdBom = 0;

        System.out.println("Colete a opinião de 5 espectadores:");
        for (int i = 0; i < QTD_ESPECTADORES; i++) {
            System.out.printf("Informe a idade do %dº espectador:\n", i + 1);
            idade = entrada.nextInt();

            System.out.printf("Informe a opinião do %dº espectador (1 - regular, 2 - bom, 3 - ótimo)\n", i + 1);
            opiniao = entrada.nextInt();

            if (opiniao == 3){
                somaDasIdadesOtimo += idade;
                qtdOtimo++;
            } else if (opiniao == 1) {
                qtdRegular++;
            } else if (opiniao == 2) {
                qtdBom++;
            }
        }

        System.out.printf("A média das idades das pessoas que responderam ótimo é de %d anos\n", somaDasIdadesOtimo / qtdOtimo);
        System.out.printf("A quantidade de pessoas que responderam regular é de %d pessoa(s)\n", qtdRegular);
        System.out.printf("A percentagem de pessoas que responderam “bom” entre todos os espectadores analisados é de %.1f%%\n", ((double) qtdBom / QTD_ESPECTADORES) * 100);
    }
}
