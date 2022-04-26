package Lista01;

/*
* Escreva um programa para calcular a quantidade de ferraduras
necessárias para equipar todos os cavalos comprados para um haras.
A informação de cavalos comprados deve ser informada pelo usuário.*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de cavalos comprados:");
        int quantidadeDeCavalos = entrada.nextInt();

        System.out.printf("A quantidade de ferraduras necessárias para equipar todos os %d cavalos é de %d\n", quantidadeDeCavalos, quantidadeDeCavalos * 4);
    }
}
