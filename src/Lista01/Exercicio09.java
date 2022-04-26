package Lista01;

/*
* Escreva um programa que leia o nome de um aluno e as notas das 3
primeiras provas que ele obteve no semestre. No final deverá informar a
média do aluno.*/

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Informe a nota da primeira prova:");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe a nota da segunda prova:");
        double nota2 = entrada.nextDouble();

        System.out.println("Informe a nota da terceira prova:");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do aluno %s é: %.2f\n", nome, media);
    }
}
