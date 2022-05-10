package modulo_poo_1.controle_de_estoque;

import java.util.Scanner;

public class TesteEstoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estoque estoque1 = new Estoque("Eletrônicos");
        int opcao;

        while (true){
            System.out.printf("Estoque de Produtos %s\n", estoque1.getNome());
            System.out.println("=======================");
            System.out.println("1 - Adicionar Produto\n2 - Listar Produtos\n3 - Editar Produto\n4 - Remover Produto\n5 - Sair");
            System.out.println("=======================");
            opcao = entrada.nextInt();

            if (opcao == 1){
                estoque1.adicionarProduto();
            } else if (opcao == 2) {
                estoque1.listarProdutos();
            }else if (opcao == 3) {
                estoque1.editarProduto();
            }else if (opcao == 4) {
                estoque1.deletarProduto();
            }else if (opcao == 5) {
                System.out.println("Até mais!");
                break;
            }else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
