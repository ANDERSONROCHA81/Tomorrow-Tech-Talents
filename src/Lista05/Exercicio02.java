package Lista05;

/*
* Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do salário bruto, mas não é descontado (é a
empresa que deposita.)
O salário líquido corresponde ao salário bruto menos os descontos. O
programa deverá pedir ao usuário o valor da sua hora e a quantidade
de horas trabalhadas no mês.
a. Desconto do IR;
b. Salário Bruto até R$900,00 (inclusive) – Isento;
c. Salário Bruto de até R$ 1500, 00 (inclusive) – desconto de 5%;
d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
e. Salário bruto acima de 2500 – Desconto de 20%.*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora de trabalho:");
        double valorDaHora = entrada.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês:");
        int horasTrabalhadas = entrada.nextInt();

        double salarioBruto = horasTrabalhadas * valorDaHora;
        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double salarioLiquido = 0;

        if (salarioBruto > 0 && salarioBruto <= 900){
            salarioLiquido = salarioBruto - descontoSindicato;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            salarioLiquido = salarioBruto - descontoSindicato - (salarioBruto * 0.05);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            salarioLiquido = salarioBruto - descontoSindicato - (salarioBruto * 0.1);
        } else if (salarioBruto > 2500) {
            salarioLiquido = salarioBruto - descontoSindicato - (salarioBruto * 0.2);
        }

        System.out.printf("O seu salário líquido será de R$ %.2f\n", salarioLiquido);
        System.out.printf("O FGTS será de R$ %.2f\n", fgts);
    }
}
