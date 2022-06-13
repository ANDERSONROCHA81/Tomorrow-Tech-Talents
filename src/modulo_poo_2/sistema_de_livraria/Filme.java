package modulo_poo_2.sistema_de_livraria;

import java.util.List;

public class Filme extends Produto{
    private String estudio;
    private List<String> diretores;
    private List<String> generos;
    private List<String> produtores;

    public Filme(String nome, double preco, int quantidade, String estudio, List<String> diretores, List<String> generos, List<String> produtores) {
        super(nome, preco, quantidade);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public List<String> getDiretores() {
        return diretores;
    }

    public void adicionarDiretor(String diretor) {
        this.diretores.add(diretor);
    }

    public void removerDiretor(String diretor) {
        this.diretores.remove(diretor);
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void adicionarGenero(String genero) {
        this.generos.add(genero);
    }

    public void removerGenero(String genero) {
        this.generos.remove(genero);
    }

    public List<String> getProdutores() {
        return produtores;
    }

    public void adicionarProdutor(String produtor) {
        this.produtores.add(produtor);
    }

    public void removerProdutor(String produtor) {
        this.produtores.remove(produtor);
    }

    @Override
    public String toString() {
        return "Filme{" + super.toString() +
                "estudio='" + estudio + '\'' +
                ", diretores=" + diretores +
                ", generos=" + generos +
                ", produtores=" + produtores +
                '}';
    }
}
