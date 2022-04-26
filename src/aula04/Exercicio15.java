package aula04;

/*
* Uma loja está levantando o valor total de todas as mercadorias em
estoque. Escreva um algoritmo que permita a entrada das seguintes
informações:
a. a quantidade de produtos que irá cadastrar
b. para cada produto:
o nome do produto
o número total de mercadorias no estoque;
o valor unitário da mercadoria.
c. Imprimir o valor total em estoque e a média de valor das
mercadorias.*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorTotalEmEstoque = 0;
        int totalDeProdutosEstocados = 0;

        System.out.println("Informe a quantidade de produtos que deseja cadastrar:");
        int qtdProdutos = entrada.nextInt();

        for (int i = 0; i < qtdProdutos; i++) {
            entrada.nextLine();
            System.out.printf("Informe o nome do produto %d:\n", i + 1);
            String nomeDoProduto = entrada.nextLine();

            System.out.printf("Informe a quantidade total de %s no estoque:\n", nomeDoProduto);
            int totalDoProdutoEstocado = entrada.nextInt();

            System.out.printf("Informe o valor unitário do(a) %s:\n", nomeDoProduto);
            double valorUnitario = entrada.nextDouble();

            valorTotalEmEstoque += totalDoProdutoEstocado * valorUnitario;
            totalDeProdutosEstocados += totalDoProdutoEstocado;
        }

        System.out.printf("O valor total em estoque é de R$ %.2f\n", valorTotalEmEstoque);
        System.out.printf("A média de valor das mercadorias é de R$ %.2f\n", valorTotalEmEstoque / totalDeProdutosEstocados);
    }
}
