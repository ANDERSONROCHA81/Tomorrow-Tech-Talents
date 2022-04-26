package Lista05;

/*
* Calcular a quantidade de dinheiro gasta por um fumante.
Dados: o número de anos que ele fuma, o nº de cigarros fumados por
dia e o preço de uma carteira com 20 cigarros.*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número de anos que você fuma:");
        int qtdAnos = entrada.nextInt();

        System.out.println("Informe o número de cigarros fumados por dia:");
        int qtdCigarrosPorDia = entrada.nextInt();

        System.out.println("Informe o preço de uma carteira com 20 cigarros:");
        double precoDaCarteira = entrada.nextDouble();

        double totalDeDinheiroGasto = (double) (qtdAnos * 365 * qtdCigarrosPorDia / 20) * precoDaCarteira;

        System.out.printf("A quantidade de dinheiro gasta para fumar %d cigarros por dia durante %d anos, com o preço da carteira com 20 cigarros em R$ %.2f, é de R$ %.2f\n", qtdCigarrosPorDia, qtdAnos, precoDaCarteira, totalDeDinheiroGasto);
    }
}
