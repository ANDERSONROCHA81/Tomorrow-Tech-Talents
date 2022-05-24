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
            }

        }while (opcao != 5);
    }
}
