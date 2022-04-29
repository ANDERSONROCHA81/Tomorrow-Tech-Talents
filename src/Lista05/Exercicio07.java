package Lista05;

/*
* Uma loja utiliza o código V para transação à vista e P para transação a
prazo. Faça um programa que receba código e valor de 15 transações
usando laços de repetição. Calcule e mostre:
○ O valor total das compras à vista
○ O valor total das compras a prazo.
○ O valor total das compras efetuadas
○ O valor da primeira prestação das compras a prazo, sabendo-se
que essas serão pagas em três vezes*/

import java.util.Scanner;

public class Exercicio07 {
    static final int NUMERO_DE_TRANSACOES = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char codigo;
        double valorDaTransacao;
        double valorTotalAVista = 0;
        double valorTotalAPrazo = 0;
        double valorTotal = 0;

        for (int i = 0; i < NUMERO_DE_TRANSACOES; i++) {
            System.out.println("Informe o valor da transação:");
            valorDaTransacao = entrada.nextDouble();

            do {
                System.out.println("Informe o código da transação - V para transação à vista e P para transação a prazo:");
                codigo = entrada.next().toLowerCase().charAt(0);

                if (codigo == 'v'){
                    valorTotalAVista += valorDaTransacao;
                } else if (codigo == 'p') {
                    valorTotalAPrazo += valorDaTransacao;
                }else {
                    System.out.println("Forma de pagamento inválida!");
                }

            } while (codigo != 'v' && codigo != 'p');

            valorTotal += valorDaTransacao;

        }

        System.out.printf("O valor total das compras à vista é de R$ %.2f\n", valorTotalAVista);
        System.out.printf("O valor total das compras a prazo é de R$ %.2f\n", valorTotalAPrazo);
        System.out.printf("O valor total das compras efetuadas é de R$ %.2f\n", valorTotal);
        System.out.printf("O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes, é de R$ %.2f\n", valorTotalAPrazo / 3);
    }
}
