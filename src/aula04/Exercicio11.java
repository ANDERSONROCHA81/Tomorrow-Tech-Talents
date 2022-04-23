package aula04;

/*
* Leia um número inteiro que representa um código de DDD para
discagem interurbana.
Em seguida, informe à qual cidade o DDD pertence, considerando a
tabela abaixo:
Se a entrada for qualquer outro DDD que não esteja presente na tabela
abaixo, o programa deverá informar:
DDD nao cadastrado
Entrada
● A entrada consiste de um único valor inteiro.
Saída
● Imprima o nome da cidade correspondente ao DDD existente na
entrada.
● Imprima DDD não cadastrado caso não exista o DDD
correspondente ao número digitado.
DDD DESTINO
61 Brasília
71 Salvador
11 São Paulo
21 Rio de Janeiro
32 Juiz de Fora
19 Campinas
27 Vitória
31 Belo Horizonte*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código DDD da cidade pra qual deseja fazer a ligação:");
        int ddd = entrada.nextInt();

        switch (ddd){
            case 61 -> System.out.printf("O DDD %d corresponde a cidade de Brasília.\n", ddd);
            case 71 -> System.out.printf("O DDD %d corresponde a cidade de Salvador.\n", ddd);
            case 11 -> System.out.printf("O DDD %d corresponde a cidade de São Paulo.\n", ddd);
            case 21 -> System.out.printf("O DDD %d corresponde a cidade do Rio de Janeiro.\n", ddd);
            case 32 -> System.out.printf("O DDD %d corresponde a cidade de Juiz de Fora.\n", ddd);
            case 19 -> System.out.printf("O DDD %d corresponde a cidade de Campinas.\n", ddd);
            case 27 -> System.out.printf("O DDD %d corresponde a cidade de Vitória.\n", ddd);
            case 31 -> System.out.printf("O DDD %d corresponde a cidade de Belo Horizonte.\n", ddd);
            default -> System.out.println("DDD não cadastrado.");
        }
    }
}
