package modulo_poo_2.sistema_de_livraria;

public interface IEstoque {
    void adicionarProduto(Produto produto);
    void removerProduto(Produto produto);
    void alterarProduto(Produto produto);
    void verProduto(Produto produto);
    void listarProdutosDoMesmoTipo(Produto produto);
    void listarProdutosDoEstoque();
    void listarProdutosPorCategoria();
}
