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

    public void setBandas(List<String> bandas) {
        this.bandas = bandas;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getSelos() {
        return selos;
    }

    public void setSelos(List<String> selos) {
        this.selos = selos;
    }

    @Override
    public String toString() {
        return super.toString() + "AlbumDeMusica{" +
                "bandas=" + bandas +
                ", generos=" + generos +
                ", selos=" + selos +
                '}';
    }
}
