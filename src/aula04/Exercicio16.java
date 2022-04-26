package aula04;

/*
* Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e
armazenar os nomes lidos em um vetor. Após isto, o algoritmo deve
permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever
a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos
anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[10];

        System.out.println("Informe o nome de 10 pessoas:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%dª pessoa: ", i + 1);
            nomes[i] = entrada.nextLine();
        }

        System.out.println("Agora, informe o nome de mais uma pessoa:");
        String outroNome = entrada.nextLine();

        boolean achei = false;

        for (String nome : nomes) {
            if (outroNome.equalsIgnoreCase(nome)){
                System.out.println("ACHEI!");
                achei = true;
                break;
            }
        }

        if (!achei){
            System.out.println("NÃO ACHEI!");
        }
    }
}
