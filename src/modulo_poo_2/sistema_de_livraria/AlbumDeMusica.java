package modulo_poo_2.sistema_de_livraria;

import java.util.List;

public class AlbumDeMusica extends Produto{
    private List<String> bandas;
    private List<String> generos;
    private List<String> selos;

    public AlbumDeMusica(String nome, double preco, int quantidade, List<String> bandas, List<String> generos, List<String> selos) {
        super(nome, preco, quantidade);
        this.bandas = bandas;
        this.generos = generos;
        this.selos = selos;
    }

    public List<String> getBandas() {
        return bandas;
    }

    public void adicionarBanda(String banda) {
        this.bandas.add(banda);
    }

    public void removerBanda(String banda) {
        this.bandas.remove(banda);
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

    public List<String> getSelos() {
        return selos;
    }

    public void adicionarSelo(String selo) {
        this.selos.add(selo);
    }

    public void removerSelo(String selo) {
        this.selos.remove(selo);
    }

    @Override
    public String toString() {
        return "AlbumDeMusica{" + super.toString() +
                "bandas=" + bandas +
                ", generos=" + generos +
                ", selos=" + selos +
                '}';
    }
}
