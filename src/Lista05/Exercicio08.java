package Lista05;

/*
* Faça um programa que receba a idade e o peso de sete pessoas.
Calcule e mostre:
○ A quantidade de pessoas com mais de 90 quilos;
○ A média das idades das sete pessoas;*/

import java.util.Scanner;

public class Exercicio08 {
    static final int QTD_PESSOAS = 7;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        double peso;
        int totalPessoasComMaisDe90Quilos = 0;
        double mediaDasIdades = 0;
        int somaDasIdades = 0;

        for (int i = 0; i < QTD_PESSOAS; i++) {
            System.out.printf("Informe a idade da %dª pessoa:\n", i + 1);
            idade = entrada.nextInt();

            System.out.printf("Informe o peso, em kg, da %dª pessoa:\n", i + 1);
            peso = entrada.nextDouble();

            somaDasIdades += idade;

            if (peso > 90){
                totalPessoasComMaisDe90Quilos++;
            }
        }

        mediaDasIdades = (double) somaDasIdades / QTD_PESSOAS;

        System.out.printf("A quantidade de pessoas com mais de 90 quilos é de %d pessoa(s)\n", totalPessoasComMaisDe90Quilos);
        System.out.printf("A média das idades das sete pessoas é de %.2f anos\n", mediaDasIdades);
    }
}
