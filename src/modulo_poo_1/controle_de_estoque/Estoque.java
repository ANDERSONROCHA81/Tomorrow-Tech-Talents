package modulo_poo_1.controle_de_estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    String nome;
    private List<Produto> produtos;
    private static int identificador = 0;

    public Estoque(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
        incrementaIdentificador();
    }

    private static void incrementaIdentificador(){
        identificador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getIdentificador() {
        return identificador;
    }

    public void listarProdutos() {
        System.out.println("Produtos no estoque:");
        for (Produto produto : produtos) {
            System.out.printf("ID: %d\nNome: %s\nSessão: %s\nTipo: %s\nQuantidade Estocada: %d\nMarca: %s",
                    getIdentificador(), produto.getNome(), produto.getSessao(), produto.getTipo(), produto.getQuantidade(), produto.getMarca());
        }
    }

    public void adicionarProduto() {
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
        produto.setQuantidade(entrada.nextInt());
        System.out.println("Informe a marca do produto:");
        produto.setMarca(entrada.nextLine());

        for (Produto produtoEstocado: produtos) {
            if (produtoEstocado.getNome().equalsIgnoreCase(produto.getNome()) && produtoEstocado.getMarca().equalsIgnoreCase(produto.getMarca())){
                produtoEstocado.setQuantidade(produtoEstocado.getQuantidade() + 1);
                temProduto = true;
            }
        }

        if (!temProduto){
            this.produtos.add(produto);
        }
    }

    public void editarProduto(Produto produto) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o novo nome do produto:");
        produto.setNome(entrada.nextLine());
        System.out.println("Informe a nova sessão do produto:");
        produto.setSessao(entrada.nextLine());
        System.out.println("Informe o novo tipo do produto:");
        produto.setTipo(entrada.nextLine());
        System.out.println("Informe a nova quantidade do produto:");
        produto.setQuantidade(entrada.nextInt());
        System.out.println("Informe a nova marca do produto:");
        produto.setMarca(entrada.nextLine());
    }

    public void deletarProduto(Produto produto) {
        this.produtos.remove(produto);
    }
}
