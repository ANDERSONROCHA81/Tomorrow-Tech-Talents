package aula03;

/*
* Escreva um programa que exiba quantas pessoas possuem mais de 18
anos. O algoritmo deverá ler a idade de 10 pessoas.*/

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] idadesDasPessoas = new int[10];

        for (int i = 0; i < idadesDasPessoas.length; i++) {
            System.out.printf("Informe a idade da %dª pessoa:\n", i + 1);
            idadesDasPessoas[i] = entrada.nextInt();
        }

        int pessoasMaioresDe18 = 0;

        for (int idade: idadesDasPessoas) {
            if (idade > 18){
                pessoasMaioresDe18++;
            }
        }

        System.out.printf("Das pessoas informadas, existem %d pessoa(s) com mais de 18 anos de idade.\n", pessoasMaioresDe18);
    }
}
