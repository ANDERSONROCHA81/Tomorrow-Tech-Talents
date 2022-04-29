package Lista05;

/*
* Para doar sangue é necessário ter entre 18 e 67 anos. Faça um
aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar
sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe qual é a sua idade:");
        int idade = entrada.nextInt();

        if (idade >= 18 && idade <= 67){
            System.out.println("Você pode doar sangue!");
        }else {
            System.out.println("Você não pode doar sangue!");
        }
    }
}
