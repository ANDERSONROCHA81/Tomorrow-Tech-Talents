package Lista01;

/*
* Crie um programa que receba um valor que foi depositado e logo em
seguida o valor com rendimento após 1 mês. Considere a taxa de juros
da poupança em 0,70% a.m.*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor que foi depositado:");
        double valorDepositado = entrada.nextDouble();

        System.out.printf("O valor de R$ %.2f, que foi depositado em uma conta com juros de 0,70 por cento ao mês, terá, depois de um mês, o valor de R$ %.2f\n", valorDepositado, valorDepositado + valorDepositado * 0.007);
    }
}
