package modulo_poo_2.sistema_de_livraria;

public class Jogo extends Produto{
    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(String nome, double preco, int quantidade, String distribuidora, String genero, String estudio) {
        super(nome, preco, quantidade);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return super.toString() + "Jogo{" +
                "distribuidora='" + distribuidora + '\'' +
                ", genero='" + genero + '\'' +
                ", estudio='" + estudio + '\'' +
                '}';
    }
}
