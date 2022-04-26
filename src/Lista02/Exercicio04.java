package Lista02;

/*
* Um hotel quer fazer um levantamento das praias da cidade para uma
programação turística. Sabendo-se que cada praia tem um nome e uma
distância (em Km) do hotel, escreva um programa que forneça os
seguintes dados:
- O nome da praia mais distante.
- Quantas praias estão a mais de 10km e a menos de 15km.
- A distância média das praias.
// Para cada praia deverá ser informado seu nome e a distância em Km
do hotel.
Você deve receber 5 praias;
Você deve armazenar o nome das 5 praias em um array;*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomesDasPraias = new String[5];
        double[] distanciasDasPraiasParaOHotel = new double[5];

        for (int i = 0; i < nomesDasPraias.length; i++) {
            System.out.println("Informe o nome da praia:");
            nomesDasPraias[i] = entrada.nextLine();

            System.out.println("Informe a distância, em Km, da praia pro hotel:");
            distanciasDasPraiasParaOHotel[i] = entrada.nextDouble();
            entrada.nextLine();
        }

        String praiaMaisDistante = nomesDasPraias[0];
        double maiorDistancia = distanciasDasPraiasParaOHotel[0];
        int qtdPraiasEntre10E15Km = 0;
        double somaDasDistancias = 0;
        double mediaDasDistancias = 0;

        for (int i = 0; i < distanciasDasPraiasParaOHotel.length; i++) {
            if (distanciasDasPraiasParaOHotel[i] > maiorDistancia){
                maiorDistancia = distanciasDasPraiasParaOHotel[i];
                praiaMaisDistante = nomesDasPraias[i];
            }

            if (distanciasDasPraiasParaOHotel[i] > 10.0 && distanciasDasPraiasParaOHotel[i] < 15.0){
                qtdPraiasEntre10E15Km++;
            }

            somaDasDistancias += distanciasDasPraiasParaOHotel[i];
        }

        mediaDasDistancias = somaDasDistancias / distanciasDasPraiasParaOHotel.length;

        System.out.printf("A praia mais distante do hotel é %s\n", praiaMaisDistante);
        System.out.printf("Existem %d praias que estão a mais de 10Km e a menos de 15Km do hotel\n", qtdPraiasEntre10E15Km);
        System.out.printf("A distância média das praias é de %.2fKm\n", mediaDasDistancias);
    }
}
