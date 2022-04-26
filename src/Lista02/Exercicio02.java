package Lista02;

/*
* Elabore um programa que escreve seu nome completo na
primeira linha, seu endereço na segunda, e o CEP e telefone na
terceira*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome completo:");
        String nome = entrada.nextLine();

        System.out.println("Informe seu endereço:");
        String endereco = entrada.nextLine();

        System.out.println("Informe seu CEP:");
        String cep = entrada.nextLine();

        System.out.println("Informe seu telefone:");
        String telefone = entrada.nextLine();

        System.out.printf("Nome: %s\nEndereço: %s\nCEP: %s  Telefone: %s\n", nome, endereco, cep, telefone);
    }
}
