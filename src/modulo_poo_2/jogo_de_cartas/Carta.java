package modulo_poo_2.jogo_de_cartas;

public class Carta {
    private String nome;
    private TipoDeCarta tipo;
    private int custo;

    public Carta(String nome, TipoDeCarta tipo, int custo) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
    }
}
