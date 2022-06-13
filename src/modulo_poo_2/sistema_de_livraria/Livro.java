package modulo_poo_2.sistema_de_livraria;

import java.util.List;

public class Livro extends Produto{
    private List<String> generos;
    private String escritor;
    private String editora;

    public Livro(String nome, double preco, int quantidade, List<String> generos, String escritor, String editora) {
        super(nome, preco, quantidade);
        this.generos = generos;
        this.escritor = escritor;
        this.editora = editora;
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

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" + super.toString() +
                "generos=" + generos +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
