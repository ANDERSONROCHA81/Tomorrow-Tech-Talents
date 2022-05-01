package Lista06;

/*
* Faça um programa que carregue uma lista com os modelos de
cinco carros (exemplo de modelos: FUSCA, GOL, VECTRA etc).
Carregue uma outra lista com o consumo desses carros, isto é,
quantos quilômetros cada um desses carros faz com um litro de
combustível. Calcule e mostre:
a. O modelo do carro mais econômico;
b. Quantos litros de combustível cada um dos carros
cadastrados consome para percorrer uma distância de 1000
quilômetros e quanto isto custará, considerando um que a
gasolina custe R$ 7,25 o litro.
c. Abaixo segue uma tela de exemplo. A disposição das
informações deve ser o mais próxima possível ao exemplo.
Os dados são fictícios e podem mudar a cada execução do
programa.*/

import java.util.Scanner;

public class Exercicio07 {
    static final double PRECO_DO_LITRO_DE_GASOLINA = 7.25;
    static final int QUANTIDADE_DE_CARROS = 5;
    static final int QUILOMETROS_PERCORRIDOS = 1000;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] modelosDosCarros = new String[QUANTIDADE_DE_CARROS];
        double[] kmPorLitro = new double[QUANTIDADE_DE_CARROS];
        String carroComMenorConsumo = modelosDosCarros[0];
        double menorConsumo = Double.MAX_VALUE;
        double qtdLitrosGastos;

        System.out.println("Comparativo de Consumo de Combustível\n");

        for (int i = 0; i < QUANTIDADE_DE_CARROS; i++) {
            System.out.printf("Veículo %d\n", i + 1);
            System.out.print("Nome: ");
            modelosDosCarros[i] = entrada.next();
            System.out.print("Km por litro: ");
            kmPorLitro[i] = entrada.nextDouble();
        }
        System.out.println("\nRelatório Final");

        for (int i = 0; i < QUANTIDADE_DE_CARROS; i++) {
            qtdLitrosGastos = QUILOMETROS_PERCORRIDOS / kmPorLitro[i];
            if (qtdLitrosGastos < menorConsumo){
                menorConsumo = qtdLitrosGastos;
                carroComMenorConsumo = modelosDosCarros[i];
            }
            System.out.printf("%d - %-10s - %7.1f - %7.1f litros - R$ %.2f\n", i + 1, modelosDosCarros[i], kmPorLitro[i], qtdLitrosGastos, qtdLitrosGastos * PRECO_DO_LITRO_DE_GASOLINA);
        }

        System.out.printf("O menor consumo é o do %s\n", carroComMenorConsumo);
    }
}
