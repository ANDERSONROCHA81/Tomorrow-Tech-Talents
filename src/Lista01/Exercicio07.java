package Lista01;

/*
* Crie um programa que receba 2 números e ao final mostre as seguintes
operações:
○ Soma
○ Subtração
○ Multiplicação
○ Divisão*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int numero1 = entrada.nextInt();

        System.out.println("Informe outro número inteiro:");
        int numero2 = entrada.nextInt();

        System.out.printf("%d + %d = %d\n", numero1, numero2, numero1 + numero2);
        System.out.printf("%d - %d = %d\n", numero1, numero2, numero1 - numero2);
        System.out.printf("%d * %d = %d\n", numero1, numero2, numero1 * numero2);
        System.out.printf("%d / %d = %.2f\n", numero1, numero2, (double)numero1 / numero2);

    }
}
