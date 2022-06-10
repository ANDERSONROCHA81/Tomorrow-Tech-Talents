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

    public void setDiretores(List<String> diretores) {
        this.diretores = diretores;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getProdutores() {
        return produtores;
    }

    public void setProdutores(List<String> produtores) {
        this.produtores = produtores;
    }

    @Override
    public String toString() {
        return super.toString() + "Filme{" +
                "estudio='" + estudio + '\'' +
                ", diretores=" + diretores +
                ", generos=" + generos +
                ", produtores=" + produtores +
                '}';
    }
}