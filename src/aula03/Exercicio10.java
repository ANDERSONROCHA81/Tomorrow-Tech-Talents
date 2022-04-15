package aula03;

/*
* Escreva um programa que gera um número inteiro aleatório entre 1 e 10 e
peça que o usuário informe o número correto, você deve dar dicas caso o
palpite esteja errado, informando se o número correto é maior ou menor
do que o informado, caso ele erre três vezes o programa se encerra e
imprime uma mensagem informando que ele perdeu.*/

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SecureRandom numeroAleatorio = new SecureRandom();

        int numero = numeroAleatorio.nextInt(1, 11);
        System.out.println(numero);

        int tentativas = 3;
        int palpite;

        System.out.println("Você tem 3 tentativas para adivinar qual foi o número escolhido");

        while (tentativas > 0){
            System.out.println("Adivinhe qual foi o número escolhido:");
            palpite = entrada.nextInt();

            if (palpite == numero){
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (palpite < numero) {
                tentativas--;
                System.out.println("O número correto é maior que o número informado.");
            } else {
                tentativas--;
                System.out.println("O número correto é menor que o número informado.");
            }

            if (tentativas == 0){
                System.out.println("Que pena! Você perdeu!");
            } else {
                System.out.printf("Você ainda tem %d tentativa(s)).\n", tentativas);
            }
        }
    }
}
