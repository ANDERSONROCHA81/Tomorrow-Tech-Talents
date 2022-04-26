package Lista02;

/*
* Escreva um programa que seja capaz de receber as seguintes
informações e calcular a média da nota de um aluno:
■ Nome
■ Turma
■ Nota 1
■ Nota 2
■ Nota 3*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Informe sua turma:");
        String turma = entrada.nextLine();

        System.out.println("Informe sua primeira nota:");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe sua segunda nota:");
        double nota2 = entrada.nextDouble();

        System.out.println("Informe sua terceira nota:");
        double nota3 = entrada.nextDouble();

        System.out.printf("O aluno %s, da turma %s, obteve média de %.2f\n", nome, turma, (nota1 + nota2 + nota3) / 3);

    }
}
