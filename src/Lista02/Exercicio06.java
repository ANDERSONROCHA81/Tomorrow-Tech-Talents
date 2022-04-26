package Lista02;

/*
* Leia 4 (quatro) números calcule o quadrado para cada um (n²) some
todos e exiba o resultado*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe 4 números inteiros:");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();
        int numero4 = entrada.nextInt();

        double somaDosNumerosAoQuadrado = Math.pow(numero1, 2) + Math.pow(numero2, 2) + Math.pow(numero3, 2) + Math.pow(numero4, 2);

        System.out.printf("A soma dos quadrados dos quatro números informados é %.2f\n", somaDosNumerosAoQuadrado);
    }
}
