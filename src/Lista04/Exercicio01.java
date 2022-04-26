package Lista04;

/*
* Escreva um código para armazenar 10 valores aleatórios até o número
100 do tipo double em um array;
(Você pode utilizar a biblioteca Random:
https://dicasdejava.com.br/como-gerar-um-numero-aleatorio-em-java/ )*/

import java.security.SecureRandom;

public class Exercicio01 {
    public static void main(String[] args) {
        SecureRandom numeroAleatorio = new SecureRandom();

        double[] numerosAleatorios = new double[10];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = numeroAleatorio.nextDouble(1.0, 101.0);
        }

        System.out.println("Os 10 números aleatórios são:");
        for (double numero : numerosAleatorios) {
            System.out.printf("%.2f   ", numero);
        }
    }
}
