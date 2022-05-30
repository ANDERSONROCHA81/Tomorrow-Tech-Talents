package modulo_poo_2.jogo_de_cartas;

public class Carta implements ICarta{
    private String nome;
    private TipoDeCarta tipo;
    private int custo;

    public Carta(String nome, TipoDeCarta tipo, int custo) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public TipoDeCarta getTipo() {
        return this.tipo;
    }

    @Override
    public int getCusto() {
        return this.custo;
    }
}
