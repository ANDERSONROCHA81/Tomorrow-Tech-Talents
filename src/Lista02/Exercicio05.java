package Lista02;

/*
* Escreva um programa para calcular a quantidade de litros de
combustível necessária para se fazer uma viagem, sabendo-se que o carro
faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a
velocidade média.
utilizar as seguintes fórmulas:
distância = tempo x velocidade
litros usados = distância / 12*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);

        System.out.println("Informe o tempo, em minutos, gasto na viagem:");
        double tempoGasto = entrada.nextDouble() / 60;

        System.out.println("Informe a velocidade média, em Km:");
        double velocidadeMedia = entrada.nextDouble();

        double distanciaPercorrida = tempoGasto * velocidadeMedia;

        System.out.printf("Foram gastos %.2f litros de combustível para fazer uma viagem de %.2f Km em %.2f horas\n", distanciaPercorrida / 12, distanciaPercorrida, tempoGasto);
    }
}
