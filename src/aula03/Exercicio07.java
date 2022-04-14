package aula03;

/*
* Escreva um programa que recebe um número inteiro maior que zero e
calcula o seu valor fatorial.*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        long fatorial = 1;

        do {
            System.out.println("Informe um número inteiro maior que zero:");
            numero = entrada.nextInt();
            if (numero <= 0){
                System.out.println("O número deve ser maior que zero!");
            }else{
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
            }
        }while (numero <= 0);

        System.out.printf("O fatorial do número %d é %d\n", numero, fatorial);
    }
}
