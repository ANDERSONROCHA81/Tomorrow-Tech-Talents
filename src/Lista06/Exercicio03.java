package Lista06;

/*
*João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu
trabalho. Toda vez que ele traz um peso de peixes maior que o
estabelecido pelo regulamento de pesca do estado de São Paulo
(50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso
(peso de peixes) e calcule o excesso. Gravar na variável excesso a
quantidade de quilos além do limite e na variável multa o valor da
multa que João deverá pagar. Imprima os dados do programa
com as mensagens adequadas.*/

import java.util.Scanner;

public class Exercicio03 {
    static final double MULTA_POR_QUILO_EXCEDENTE = 4.00;
    static final double PESO_MAXIMO_PERMITIDO = 50.00;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o peso, em kg, dos peixes pescados:");
        double peso = entrada.nextDouble();

        double excesso = peso - PESO_MAXIMO_PERMITIDO;
        double multaAPagar = excesso * MULTA_POR_QUILO_EXCEDENTE;

        if (peso > PESO_MAXIMO_PERMITIDO){
            System.out.printf("João Papo-de-Pescador, por ter pescado %.1f kg a mais do que o permitido, irá pagar uma multa de R$ %.2f\n", excesso, multaAPagar);
        }else {
            System.out.println("João Papo-de-Pescador não foi multado.");
        }
    }
}
