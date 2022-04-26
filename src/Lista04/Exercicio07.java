package Lista04;

/*
*  Escreva um código que leia um vetor G de 10 elementos do tipo caracter
que representa o gabarito de uma prova. A seguir, para cada um dos 10
alunos da turma, leia o vetor de respostas (R) do aluno e conte o
número de acertos. Mostre o número de acertos do aluno e uma
mensagem APROVADO, se a nota for maior ou igual a 6; e mostre uma
mensagem de REPROVADO, caso contrário.*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char[] G = new char[10];

        for (int i = 0; i < G.length; i++) {
            System.out.printf("Informe a resposta da %dª questão da prova:\n", i + 1);
            G[i] = entrada.next().charAt(0);
        }

        char[][] R = new char[10][10];
        int numeroDeAcertos;

        for (int i = 0; i < R.length; i++) {
            numeroDeAcertos = 0;
            System.out.printf("Informe as respostas do %dº aluno:", i + 1);
            for (int j = 0; j < R[i].length; j++) {
                R[i][j] = entrada.next().charAt(0);

                if (R[i][j] == G[j]){
                    numeroDeAcertos++;
                }
            }
            if (numeroDeAcertos >= 6){
                System.out.printf("O Aluno %d obteve %d acertos e está APROVADO!\n", i + 1, numeroDeAcertos);
            }else{
                System.out.printf("O Aluno %d obteve %d acertos e está REPROVADO!\n", i + 1, numeroDeAcertos);
            }
        }
    }
}
