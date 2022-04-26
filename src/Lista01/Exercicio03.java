package Lista01;

/*
* Escreva um programa que realize o cálculo do empréstimo a juros
compostos. Onde definimos:
○ o valor da variável de quanto a pessoa quer emprestado;
○ em quantos meses ela irá pagar
■ A taxa de juros será de 2% ao mês
■ Fórmula: M = C * (1+i)^t
● M = valor final após a aplicação dos juros
● C = valor que a pessoa vai pegar emprestado
● i é a taxa de juros
● t é o tempo
○ Deverá exibir quanto a pessoa irá pagar após a aplicação dos
juros*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor que você deseja pegar emprestado:");
        double valorEmprestado = entrada.nextDouble();

        System.out.println("Informe em quantos meses deseja pagar o empréstimo:");
        int meses = entrada.nextInt();

        double valorASerPago = valorEmprestado * Math.pow((1 + 0.02), meses);

        System.out.printf("O valor final a ser pago é de R$ %.2f\n", valorASerPago);
    }
}
