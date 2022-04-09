package aula01;

/*
* Crie um algoritmo que realize a conversão do valor em real para as
seguintes moedas:
○ Dólar
○ Euro
○ Libra*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor em real pra ser convertido em outras moedas:");
        double valorEmReal = entrada.nextDouble();

        double valorEmDolar = valorEmReal / 4.75;
        double valorEmEuro = valorEmReal / 5.12;
        double valorEmLibra = valorEmReal / 6.14;

        System.out.printf("R$ %.2f = USD %.2f\n", valorEmReal, valorEmDolar);
        System.out.printf("R$ %.2f = EUR %.2f\n", valorEmReal, valorEmEuro);
        System.out.printf("R$ %.2f = GBP %.2f\n", valorEmReal, valorEmLibra);

    }
}
