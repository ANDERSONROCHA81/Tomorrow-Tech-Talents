package Lista04;

/*
* Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma
empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total
das vendas até R$1.500,00 mais 5% sobre o que ultrapassar este valor,
calcular e escrever o seu salário total.*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salário fixo do vendedor:");
        double salarioFixo = entrada.nextDouble();
        System.out.println("Informe o valor das vendas efetuadas pelo vendedor:");
        double valorDasVendas = entrada.nextDouble();

        double comissao = 0;

        if (valorDasVendas > 0 && valorDasVendas <= 1500){
            comissao = valorDasVendas * 0.03;
        }else if (valorDasVendas > 1500) {
            comissao = 1500 * 0.03 + (valorDasVendas - 1500) * 0.05;
        }

        System.out.printf("O salário total do vendedor será de R$ %.2f\n", salarioFixo + comissao);
    }
}
