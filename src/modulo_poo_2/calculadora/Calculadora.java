package modulo_poo_2.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double resultado = 0;

        int opcao;

        do {
            System.out.println("==========Calculadora==========");
            System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
            System.out.println("===============================");
            System.out.println("Escolha qual das operações acima você deseja realizar:");
            opcao = entrada.nextInt();

            if (opcao == 1){
                Soma soma = new Soma();
                int escolha;
                System.out.println("Informe quantos números deseja somar:");
                escolha = entrada.nextInt();
                double[] numeros = new double[escolha];

                for (int i = 0; i < escolha; i++) {
                    System.out.printf("Informe o %dº número:\n", i + 1);
                    numeros[i] = entrada.nextDouble();
                }

               resultado = soma.calcular(numeros);
                System.out.printf("O resultado da soma dos números informados é %.2f\n", resultado);
            } else if (opcao == 2){
                Subtracao subtracao = new Subtracao();
                int escolha;
                System.out.println("Informe quantos números deseja subtrair:");
                escolha = entrada.nextInt();
                double[] numeros = new double[escolha];

                for (int i = 0; i < escolha; i++) {
                    System.out.printf("Informe o %dº número:\n", i + 1);
                    numeros[i] = entrada.nextDouble();
                }

                resultado = subtracao.calcular(numeros);
                System.out.printf("O resultado da subtração dos números informados é %.2f\n", resultado);
            } else if (opcao == 3){
                Multiplicacao multiplicacao = new Multiplicacao();
                int escolha;
                System.out.println("Informe quantos números deseja multiplicar:");
                escolha = entrada.nextInt();
                double[] numeros = new double[escolha];

                for (int i = 0; i < escolha; i++) {
                    System.out.printf("Informe o %dº número:\n", i + 1);
                    numeros[i] = entrada.nextDouble();
                }

                resultado = multiplicacao.calcular(numeros);
                System.out.printf("O resultado da multiplicação dos números informados é %.2f\n", resultado);
            } else if (opcao == 4){
                Divisao divisao = new Divisao();
                int escolha;
                System.out.println("Informe quantos números deseja dividir:");
                escolha = entrada.nextInt();
                double[] numeros = new double[escolha];

                for (int i = 0; i < escolha; i++) {
                    System.out.printf("Informe o %dº número:\n", i + 1);
                    numeros[i] = entrada.nextDouble();
                }

                resultado = divisao.calcular(numeros);
                System.out.printf("O resultado da divisão, em sequência, dos números informados é %.2f\n", resultado);
            } else if (opcao == 5){
                System.out.println("Até mais!!!");
            }

        }while (opcao != 5);
    }
}
