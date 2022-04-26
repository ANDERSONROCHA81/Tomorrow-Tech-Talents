package Lista04;

/*
* Crie um método que recebe uma matriz bidimensional double e retorna
o maior valor da matriz.*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] numeros = new double[3][3];

        System.out.println("Informe 9 números:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = entrada.nextDouble();
            }
        }

        double maior = numeros[0][0];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if ( numeros[i][j] > maior){
                    maior = numeros[i][j];
                }
            }
        }

        System.out.printf("O maior número da matriz é %.2f\n", maior);
    }
}
