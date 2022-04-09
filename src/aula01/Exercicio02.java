package aula01;

import java.util.Scanner;

/*
* Escreva um programa para determinar a quantidade de cavalos para
se levantar uma massa de “m” quilogramas a uma altura de “h” em “t”
segundos.
○ Considere cavalos = (m * h / t ) / 745,6999
*/

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da massa, em kg, que será levantada:");
        double massa = entrada.nextDouble();

        System.out.println("Informe a que altura, em metros, a massa será levantada:");
        double altura = entrada.nextDouble();

        System.out.println("Informe o tempo, em segundos, para a massa ser levantada:");
        double tempo = entrada.nextDouble();

        double cavalos = (massa * altura / tempo) / 745.6999;

        System.out.printf("Será necessário %.2f cavalos para se levantar uma massa de %.2f kg, a uma altura de %.2f metros em %.2f segundos\n", cavalos, massa, altura, tempo);

    }
}
