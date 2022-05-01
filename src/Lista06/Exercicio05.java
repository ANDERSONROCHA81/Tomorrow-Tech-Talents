package Lista06;

/*
* Tendo como dado de entrada a altura (h) de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
a. Para homens: (72.7*h) - 58
b. Para mulheres: (62.1*h) - 44.7*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double pesoIdeal;
        char sexo;

        while (true) {
            System.out.println("Informe o seu sexo, M - Masculino ou F - Feminino:");
            sexo = entrada.next().toLowerCase().charAt(0);
            if(sexo != 'm' && sexo != 'f'){
                System.out.println("Sexo inválido!");
            }else {
                break;
            }
        }

        System.out.println("Informe a sua altura:");
        double altura = entrada.nextDouble();

        if (sexo == 'm'){
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("O peso ideal para você que é homem, de altura %.2f m, é de %.2f kg\n", altura, pesoIdeal);
        } else if (sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("O peso ideal para você que é mulher, de altura %.2f m, é de %.2f kg\n", altura, pesoIdeal);
        }
    }
}
