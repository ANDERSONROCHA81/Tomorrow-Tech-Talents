package Lista04;

/*
* Escreva um programa que leia um vetor de 13 elementos inteiros, que é
o Gabarito de um teste da loteria esportiva, contendo os valores
1(coluna 1), 2 (coluna 2) e 3 (coluna 3). Leia, a seguir, para cada apostador,
o número do seu cartão e um vetor de Respostas de 13 posições.
Verifique para cada apostador o números de acertos, comparando o
vetor de Gabarito com o vetor de Respostas. Escreva o número do
apostador e o número de acertos. Se o apostador tiver 13 acertos,
mostrar a mensagem "Ganhador".*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] gabarito = {2, 1, 3, 3, 2, 3, 1, 2, 3, 1, 2, 3, 1};

        System.out.println("Informe o número do seu cartão:");
        int numeroCartao = entrada.nextInt();

        System.out.println("Informe os 13 números que você escolheu:");
        int[] respostas = new int[13];
        int numeroDeAcertos = 0;

        for (int i = 0; i < respostas.length; i++) {
            respostas[i] = entrada.nextInt();
            if (gabarito[i] == respostas[i]){
                numeroDeAcertos++;
            }
        }

        System.out.print("Gabarito: ");
        for (int numero : gabarito) {
            System.out.printf("%d ", numero);
        }

        System.out.print("\nSua resposta: ");
        for (int numero : respostas) {
            System.out.printf("%d ", numero);
        }

        System.out.printf("\nO apostador com o cartão de número %d obteve %d acertos\n", numeroCartao, numeroDeAcertos);

        if (numeroDeAcertos == 13){
            System.out.println("Ganhador!");
        }
    }
}
