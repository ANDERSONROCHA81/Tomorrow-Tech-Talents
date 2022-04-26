package Lista04;

/*
* Faça a leitura de um valor inteiro. Em seguida, calcule o menor número
de notas possíveis (cédulas) onde o valor pode ser decomposto. As
notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
Na sequência mostra o valor lido e a relação de notas necessárias*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Informe um valor inteiro em Reais para ser decomposto em notas:");
        int valor = entrada.nextInt();
        int indice = 0;
        int qtdNotas = 0;

        while (valor > 0){
            if (valor >= notas[indice]){
                qtdNotas = valor / notas[indice];
                valor = valor % notas[indice];
                System.out.printf("%d notas de R$ %d\n", qtdNotas, notas[indice]);
            }else {
                indice++;
            }
        }
    }
}
