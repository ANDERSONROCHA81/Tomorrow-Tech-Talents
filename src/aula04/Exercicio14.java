package aula04;

/*
* Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
(considere que as idades dos homens serão sempre diferentes entre si,
bem como as das mulheres).
Calcule e escreva a soma das idades do homem mais velho com a
mulher mais nova, e o produto das idades do homem mais novo com a
mulher mais velha.*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idadeHomem1, idadeHomem2, idadeMulher1, idadeMulher2;
        int idadeHomemMaisVelho, idadeHomemMaisNovo, idadeMulherMaisVelha, idadeMulherMaisNova;

        while (true){
            System.out.println("Informe as idades de 2 homens:");
            idadeHomem1 = entrada.nextInt();
            idadeHomem2 = entrada.nextInt();
            if (idadeHomem1 != idadeHomem2){
                break;
            }else {
                System.out.println("As idades dos homens devem ser diferentes!");
            }
        }

        idadeHomemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
        idadeHomemMaisVelho = Math.max(idadeHomem1, idadeHomem2);

        while (true){
            System.out.println("Informe as idades de 2 mulheres:");
            idadeMulher1 = entrada.nextInt();
            idadeMulher2 = entrada.nextInt();
            if (idadeMulher1 != idadeMulher2){
                break;
            }else {
                System.out.println("As idades das mulheres devem ser diferentes!");
            }
        }

        idadeMulherMaisNova = Math.min(idadeMulher1, idadeMulher2);
        idadeMulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);

        System.out.printf("A soma das idades do homem mais velho com a mulher mais nova é %d\n", idadeHomemMaisVelho + idadeMulherMaisNova);
        System.out.printf("O produto das idades do homem mais novo com a mulher mais velha é %d\n", idadeHomemMaisNovo * idadeMulherMaisVelha);
    }
}
