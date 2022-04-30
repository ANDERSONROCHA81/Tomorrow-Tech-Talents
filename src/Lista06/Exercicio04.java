package Lista06;

/*
* Foi feita uma estatística em cinco cidades brasileiras para coletar
dados sobre acidentes de trânsito. Foram obtidos os seguintes
dados:
a. Código da cidade;
b. Número de veículos de passeio (em 2021);
c. Número de acidentes de trânsito com vítimas (em 2021).
Deseja-se saber:
d. Qual o maior e menor índice de acidentes de trânsito e a
que cidade pertence;
e. Qual a média de veículos nas cinco cidades juntas;
f. Qual a média de acidentes de trânsito nas cidades com
menos de 2.000 veículos de passeio.*/

import java.util.Scanner;

public class Exercicio04 {
    static final int NUMERO_DE_CIDADES = 5;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] codigosDasCidades = new String[NUMERO_DE_CIDADES];
        int[] numerosDeVeiculosDePasseio = new int[NUMERO_DE_CIDADES];
        int[] numerosDeAcidentesDeTransito = new int[NUMERO_DE_CIDADES];
        int menorIndiceDeAcidente = Integer.MAX_VALUE, maiorIndiceDeAcidente = Integer.MIN_VALUE, qtdDeVeiculos = 0;
        int indiceDaMenorQtdDeAcidentes = 0, indiceDaMaiorQtdDeAcidentes = 0;
        int qtdAcidentes = 0, qtdCidadesComMenosDe2000Veiculos = 0;

        for (int i = 0; i < NUMERO_DE_CIDADES; i++) {
            System.out.println("Informe o código da cidade:");
            codigosDasCidades[i] = entrada.next();

            System.out.println("Informe o número de veículos de passeio da cidade:");
            numerosDeVeiculosDePasseio[i] = entrada.nextInt();

            System.out.println("Informe o número de acidentes de trânsito com vítimas da cidade:");
            numerosDeAcidentesDeTransito[i] = entrada.nextInt();

            qtdDeVeiculos += numerosDeVeiculosDePasseio[i];

            if (numerosDeAcidentesDeTransito[i] < menorIndiceDeAcidente){
                menorIndiceDeAcidente = numerosDeAcidentesDeTransito[i];
                indiceDaMenorQtdDeAcidentes = i;
            }

            if (numerosDeAcidentesDeTransito[i] > maiorIndiceDeAcidente){
                maiorIndiceDeAcidente = numerosDeAcidentesDeTransito[i];
                indiceDaMaiorQtdDeAcidentes = i;
            }

            if (numerosDeVeiculosDePasseio[i] < 2000){
                qtdAcidentes += numerosDeAcidentesDeTransito[i];
                qtdCidadesComMenosDe2000Veiculos++;
            }
        }

        System.out.printf("O menor índice de acidentes de trânsito é de %d acidentes, pertencente à cidade com o código %s\n", menorIndiceDeAcidente, codigosDasCidades[indiceDaMenorQtdDeAcidentes]);
        System.out.printf("O maior índice de acidentes de trânsito é de %d acidentes, pertencente à cidade com o código %s\n", maiorIndiceDeAcidente, codigosDasCidades[indiceDaMaiorQtdDeAcidentes]);
        System.out.printf("A média de veículos nas cinco cidades juntas é de %d veículos\n", qtdDeVeiculos / NUMERO_DE_CIDADES);
        System.out.printf("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é de %d acidentes\n", qtdAcidentes / qtdCidadesComMenosDe2000Veiculos);
    }
}
