package aula04;  /*
A prefeitura de uma cidade deseja fazer uma pesquisa entre seus
habitantes. Faça um algoritmo para coletar dados sobre o salário e
número de filhos de cada habitante e após as leituras, escrever:
a. Média de salário da população
b. Média do número de filhos
c. Maior salário dos habitantes
d. Percentual de pessoas com salário menor que R$ 150,00
Obs: O final da leitura dos dados se dará com a entrada de um “salário
negativo”.*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double somaDosSalarios = 0;
        double maiorSalario = 0;
        int somaDosFilhos = 0;
        int qtdPessoas = 0;
        int qtdPais = 0;
        int pessoasComSalarioMenorQue150 = 0;
        int pessoasComSalario = 0;

        while (true){
            System.out.println("Informe o seu salário:");
            double salario = entrada.nextDouble();

            if (salario < 0){
                break;
            }else {
                somaDosSalarios += salario;
                pessoasComSalario++;
                maiorSalario = Math.max(maiorSalario, salario);
            }

            if (salario < 150){
                pessoasComSalarioMenorQue150++;
            }

            System.out.println("Informe o número de filhos que você tem:");
            int qtdFilhos = entrada.nextInt();

            somaDosFilhos += qtdFilhos;
            qtdPessoas += qtdFilhos + 2;
            qtdPais += 2;
        }

        System.out.printf("A média de salário da população é de R$ %.2f\n", somaDosSalarios / qtdPessoas);
        System.out.printf("A média do número de filhos é de %d filho(s)\n", somaDosFilhos / qtdPais);
        System.out.printf("O maior salário é de R$ %.2f\n", maiorSalario);
        System.out.printf("O Percentual de pessoas com salário menor que R$ 150,00 é de %.2f por cento\n", ( (double) pessoasComSalarioMenorQue150 / pessoasComSalario) * 100);
    }
}
