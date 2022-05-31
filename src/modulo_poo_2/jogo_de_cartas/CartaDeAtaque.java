package modulo_poo_2.jogo_de_cartas;

public class CartaDeAtaque extends Carta implements ICarta {
    protected int poder;
    protected int resistencia;

    public CartaDeAtaque(String nome, TipoDeCarta tipo, int custo, int poder, int resistencia) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.poder = poder;
        this.resistencia = resistencia;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public TipoDeCarta getTipo() {
        return tipo;
    }

    @Override
    public int getCusto() {
        return custo;
    }

    @Override
    public int getPoder() {
        return poder;
    }

    @Override
    public int getResistencia() {
        return resistencia;
    }
}
