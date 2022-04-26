package Lista01;

/*
* Crie um programa que você atribua um valor da idade de uma pessoa e
calcule quantos dias aquela pessoa já viveu*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        int idade = entrada.nextInt();

        System.out.printf("Você já viveu %d dias\n", idade * 365);
    }
}
