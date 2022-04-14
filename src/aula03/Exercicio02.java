package aula03;

/*
* Faça um programa que leia um número inteiro diferente de zero e mostre
uma mensagem indicando se este número é positivo ou negativo. Pare a
execução do programa quando o usuário requisitar (O programa deve
parar quando o usuário escolher 0).*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Informe um número inteiro:");
            numero = entrada.nextInt();

            if (numero == 0){
                System.out.println("Até mais!");
                break;
            }else if (numero > 0) {
                System.out.printf("O número %d é positivo\n", numero);
            }else{
                System.out.printf("O número %d é negativo\n", numero);
            }

        }while (true);
    }
}
