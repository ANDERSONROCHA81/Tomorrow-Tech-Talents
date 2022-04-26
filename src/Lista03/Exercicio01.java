package Lista03;

/*
* Escreva um programa que leia quatro notas escolares de um aluno e
apresenta uma mensagem informando se o aluno foi aprovado caso
apresente o valor da média escolar maior ou igual a 7. Caso contrário,
apresente uma mensagem informando que ele está de recuperação*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota, soma = 0.0;
        for (int i = 0; i < 4; i++) {
            System.out.printf("Informe a %dª nota do aluno: \n", i + 1);
            nota = entrada.nextDouble();
            soma += nota;
        }

        double mediaEscolar = soma / 4;

        if (mediaEscolar >= 7) {
            System.out.printf("O aluno foi aprovado com a média %.1f\n", mediaEscolar);
        }else{
            System.out.printf("O aluno está em recuperação, pois obteve média de %.1f\n", mediaEscolar);
        }
    }
}
