package Lista05;

/*
* Crie uma agenda que armazena, nome da pessoa, número do telefone,
idade. Sua agenda deve possibilitar:
(1) – inserir um contato
(2) – Remover um contato*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quantos contatos serão armazenados na agenda:");
        int qtdPessoas = entrada.nextInt();

        String[] nomes = new String[qtdPessoas];
        String[] telefones = new String[qtdPessoas];
        int[] idades = new int[qtdPessoas];
        int contatosNaAgenda = 0;
        int opcao;
        String nome;

        do {
            System.out.println("===============AGENDA===============");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Inserir contato\n2 - Remover contato\n3 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){
                case 1 -> {
                    System.out.println("==========INSERIR CONTATO==========");
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] == null && telefones[i] == null && idades[i] == 0){
                            System.out.println("Informe o nome do contato");
                            nomes[i] = entrada.nextLine();
                            System.out.println("Informe o telefone do contato");
                            telefones[i] = entrada.nextLine();
                            System.out.println("Informe a idade do contato");
                            idades[i] = entrada.nextInt();
                            System.out.println("Contato inserido com sucesso!");
                            contatosNaAgenda++;
                            break;
                        }else if(contatosNaAgenda == qtdPessoas){
                            System.out.println("A agenda esta cheia!");
                        }
                    }
                }

                case 2 -> {
                    boolean contatoExiste = true;
                    System.out.println("==========REMOVER CONTATO==========");
                    System.out.printf("Contatos na agenda: %d\n", contatosNaAgenda);
                    for (int i = 0; i < nomes.length; i++) {
                        System.out.printf("Nome: %s\nTelefone: %s\nIdade: %d\n", nomes[i], telefones[i], idades[i]);
                    }

                    System.out.println("Qual contato você deseja remover?");
                    nome = entrada.nextLine();
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null && nomes[i].equalsIgnoreCase(nome)){
                            nomes[i] = null;
                            telefones[i] = null;
                            idades[i] = 0;
                            System.out.println("Contato removido com sucesso!");
                            contatosNaAgenda--;
                            break;
                        } else if (nomes[i] == null || !nomes[i].equalsIgnoreCase(nome)) {
                            contatoExiste = false;
                        }
                    }

                    if (!contatoExiste){
                        System.out.println("O contato não está na agenda!");
                    }
                }
            }
        }while (opcao != 3);
    }
}
