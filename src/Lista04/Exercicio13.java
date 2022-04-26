package Lista04;

/*
* Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
Álcool
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos e o tipo de
combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule
e imprima o valor a ser pago pelo cliente sabendo-se que o preço do
litro da gasolina é R$ 7,59 e o preço do litro do álcool é R$ 5,20.*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorASerPago = 0;

        System.out.println("Informe qual o tipo de combustível (A - álcool, G - gasolina):");
        char tipoDeCombustivel = entrada.next().toLowerCase().charAt(0);

        System.out.println("Informe a quantidade de litros do combustível:");
        int qtdLitros = entrada.nextInt();

        if (tipoDeCombustivel == 97 && qtdLitros > 0 && qtdLitros <= 20 ){
            valorASerPago = qtdLitros * 5.20 - (qtdLitros * 5.20 * 0.03);
            System.out.printf("O valor a ser pago pela compra de %d litros de álcool é de R$ %.2f\n", qtdLitros, valorASerPago);
        } else if (tipoDeCombustivel == 97 && qtdLitros > 20 ){
            valorASerPago = qtdLitros * 5.20 - (qtdLitros * 5.20 * 0.05);
            System.out.printf("O valor a ser pago pela compra de %d litros de álcool é de R$ %.2f\n", qtdLitros, valorASerPago);
        }else if (tipoDeCombustivel == 103 && qtdLitros > 0 && qtdLitros <= 20 ){
            valorASerPago = qtdLitros * 7.59 - (qtdLitros * 7.59 * 0.04);
            System.out.printf("O valor a ser pago pela compra de %d litros de gasolina é de R$ %.2f\n", qtdLitros, valorASerPago);
        }else if (tipoDeCombustivel == 103 && qtdLitros > 20 ){
            valorASerPago = qtdLitros * 7.59 - (qtdLitros * 7.59 * 0.06);
            System.out.printf("O valor a ser pago pela compra de %d litros de gasolina é de R$ %.2f\n", qtdLitros, valorASerPago);
        }
    }
}
