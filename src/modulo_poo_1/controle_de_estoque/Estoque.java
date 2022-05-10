package modulo_poo_1.controle_de_estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    private int id;
    String nome;
    private List<Produto> produtos;
    private static int incrementaId = 0;

    public Estoque(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
        this.id = ++incrementaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void listarProdutos() {
        System.out.println("\n====Listar Produtos====");
        if (this.produtos.isEmpty()){
            System.out.println("Ainda não temos produtos no estoque!");
        }else {
            System.out.println("Produtos no estoque:");
            for (Produto produto : produtos) {
                System.out.printf("ID: %d\nNome: %s\nSessão: %s\nTipo: %s\nQuantidade Estocada: %d\nMarca: %s\n\n",
                        produto.getId(), produto.getNome(), produto.getSessao(), produto.getTipo(), produto.getQuantidade(), produto.getMarca());
            }
        }
        System.out.println("=======================");
    }

    public void adicionarProduto() {
        System.out.println("\n==Adicionar Produto===");
        Scanner entrada = new Scanner(System.in);
        boolean temProduto = false;
        Produto produto = new Produto();

        System.out.println("Informe o nome do produto:");
        produto.setNome(entrada.nextLine());
        System.out.println("Informe a sessão do produto:");
        produto.setSessao(entrada.nextLine());
        System.out.println("Informe o tipo do produto:");
        produto.setTipo(entrada.nextLine());
        System.out.println("Informe a quantidade do produto:");
        int quantidade = entrada.nextInt();
        produto.setQuantidade(quantidade);
        entrada.nextLine();
        System.out.println("Informe a marca do produto:");
        produto.setMarca(entrada.nextLine());

        for (Produto produtoEstocado: produtos) {
            if (produtoEstocado.getNome().equalsIgnoreCase(produto.getNome()) && produtoEstocado.getMarca().equalsIgnoreCase(produto.getMarca())){
                produtoEstocado.setQuantidade(produtoEstocado.getQuantidade() + quantidade);
                temProduto = true;
                System.out.println("Produto adicionado com sucesso!");
            }
        }

        if (!temProduto){
            this.produtos.add(produto);
            System.out.println("Produto adicionado com sucesso!");
        }
        System.out.println("=======================");
    }

    public void editarProduto() {
        System.out.println("\n=====Editar Produto====");
        Scanner entrada = new Scanner(System.in);
        boolean temProduto = false;

        System.out.println("Informe o nome do produto que deseja editar:");
        String nomeDoProduto = entrada.nextLine();

        for (Produto produto: this.produtos) {
            if (nomeDoProduto.equalsIgnoreCase(produto.getNome())){
                System.out.println("Informe o novo nome do produto:");
                produto.setNome(entrada.nextLine());
                System.out.println("Informe a nova sessão do produto:");
                produto.setSessao(entrada.nextLine());
                System.out.println("Informe o novo tipo do produto:");
                produto.setTipo(entrada.nextLine());
                System.out.println("Informe a nova quantidade do produto:");
                produto.setQuantidade(entrada.nextInt());
                entrada.nextLine();
                System.out.println("Informe a nova marca do produto:");
                produto.setMarca(entrada.nextLine());
                temProduto = true;
                System.out.println("Produto editado com sucesso!");
                break;
            }
        }

        if (!temProduto){
            System.out.println("Não existe esse produto no estoque!");
        }
        System.out.println("=======================");
    }

    public void deletarProduto() {
        System.out.println("====Remover Produto===");
        Scanner entrada = new Scanner(System.in);
        boolean temProduto = false;

        System.out.println("Informe o nome do produto que deseja remover:");
        String nomeDoProduto = entrada.nextLine();
        for (Produto produto : this.produtos) {
            if (nomeDoProduto.equalsIgnoreCase(produto.getNome())){
                this.produtos.remove(produto);
                temProduto = true;
                System.out.println("Produto removido com sucesso!");
                break;
            }
        }

        if (!temProduto){
            System.out.println("Não existe esse produto no estoque!");
        }
        System.out.println("=======================");
    }
}
