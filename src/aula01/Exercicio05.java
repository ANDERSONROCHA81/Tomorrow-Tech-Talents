package aula01;

import java.util.Scanner;

/*
* Crie um programa que com base em um salário de um funcionário,
reajusta o salário em 7% e mostra o valor antes do reajuste e após.*/

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu salário:");
        double salario = entrada.nextDouble();

        System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);
        System.out.printf("Salário após reajuste de 7 por cento: R$ %.2f\n", salario + salario * 0.07);
    }
}
