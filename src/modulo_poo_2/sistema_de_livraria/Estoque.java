package modulo_poo_2.sistema_de_livraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estoque implements IEstoque {

    private List<Produto> produtosEstocados = new ArrayList<>();
    @Override
    public void adicionarProduto(Produto produto) {
        this.produtosEstocados.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        this.produtosEstocados.remove(produto);
    }

    @Override
        public void alterarProduto(Produto produto) {
    
        }

    @Override
    public void verProduto(Produto produto) {
        if (this.produtosEstocados.contains(produto)){
            System.out.println(produto);
        }else {
            System.out.println("Não existe esse produto no nosso estoque.");
        }
    }

    @Override
    public void listarProdutosDoMesmoTipo(Produto produto) {

    }

    @Override
    public void listarProdutosDoEstoque() {
        this.produtosEstocados.forEach(System.out::println);
    }

    @Override
    public void listarProdutosPorCategoria() {
        Map<? extends Class<? extends Produto>, List<Produto>> porCategoria = this.produtosEstocados
                .stream()
                .collect(Collectors.groupingBy(Produto::getClass, Collectors.toList()));
        System.out.println(porCategoria);
    }
}
