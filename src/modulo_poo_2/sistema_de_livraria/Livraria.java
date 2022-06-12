package modulo_poo_2.sistema_de_livraria;

public class Livraria {
    private IEstoque estoque;
    private ICaixa caixa;

    public Livraria() {
        this.estoque = new Estoque();
        this.caixa = new Caixa();
    }

    public IEstoque getEstoque() {
        return estoque;
    }

    public ICaixa getCaixa() {
        return caixa;
    }

    public void vender(Cliente cliente, Produto produto, int quantidade) {
        double valor = produto.getPreco() * quantidade;
        produto.setQuantidade(quantidade);
        this.caixa.adicionarDinheiroAoCaixa(valor);
        cliente.adicionarProduto(produto);
    }
}
