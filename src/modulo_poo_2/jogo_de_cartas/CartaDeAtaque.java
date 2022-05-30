package modulo_poo_2.jogo_de_cartas;

public class CartaDeAtaque extends Carta implements ICarta{
    private int poder;
    private int resistencia;

    public CartaDeAtaque(String nome, TipoDeCarta tipo, int custo, int poder, int resistencia) {
        super(nome, tipo, custo);
        this.poder = poder;
        this.resistencia = resistencia;
    }

    @Override
    public int getPoder() {
        return this.poder;
    }

    @Override
    public int getResistencia() {
        return this.resistencia;
    }
}
