package aula01;

/*
* Escreva um programa em java para definir o consumo médio de um
automóvel sendo fornecido a distância total percorrida pelo automóvel
e o total de combustível gasto (litros).*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a distância, em km, percorrida pelo automóvel:");
        double distanciaPercorrida = entrada.nextDouble();

        System.out.println("Informe a quantidade de combustível, em litros, gasto pelo automóvel:");
        double combustivelGasto = entrada.nextDouble();

        System.out.printf("Consumo médio do automóvel: %.2f litros por km\n", combustivelGasto / distanciaPercorrida);
    }
}
