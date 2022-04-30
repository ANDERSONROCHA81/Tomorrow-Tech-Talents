package Lista05;

/*
* Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
Digite a opção desejada:
Na opção 1: receber duas notas, calcular e mostrar a média
aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular
e mostrar a média ponderada.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.*/

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu de opções:");
            System.out.println("1 - Média aritmética\n2 - Média ponderada\n3 - Sair");
            System.out.println("Digite a opção desejada:");
            opcao = entrada.nextInt();

            switch (opcao){
                case 1 -> {
                    double nota1, nota2;
                    System.out.println("Informe a 1ª nota:");
                    nota1 = entrada.nextDouble();

                    System.out.println("Informe a 2ª nota:");
                    nota2 = entrada.nextDouble();

                    double mediaAritmetica = (nota1 + nota2) / 2;

                    System.out.printf("A média aritmética obtida com as notas %.1f e %.1f é %.1f\n", nota1, nota2, mediaAritmetica);
                }

                case 2 ->{
                    double nota1, nota2, nota3;
                    int peso1, peso2, peso3;

                    System.out.println("Informe a 1ª nota:");
                    nota1 = entrada.nextDouble();
                    System.out.println("Informe o peso da 1ª nota:");
                    peso1 = entrada.nextInt();

                    System.out.println("Informe a 2ª nota:");
                    nota2 = entrada.nextDouble();
                    System.out.println("Informe o peso da 2ª nota:");
                    peso2 = entrada.nextInt();

                    System.out.println("Informe a 3ª nota:");
                    nota3 = entrada.nextDouble();
                    System.out.println("Informe o peso da 3ª nota:");
                    peso3 = entrada.nextInt();

                    double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

                    System.out.printf("A média ponderada das notas %.1f com peso %d, %.1f com peso %d e %.1f com peso %d é %.1f\n", nota1, peso1, nota2, peso2, nota3, peso3, mediaPonderada);
                }

                case 3 -> System.out.println("Até mais!");

                default -> System.out.println("Opção inválida!");
            }

        }while (opcao != 3);
    }
}
