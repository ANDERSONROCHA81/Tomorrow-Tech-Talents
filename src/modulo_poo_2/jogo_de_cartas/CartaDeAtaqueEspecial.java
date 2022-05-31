package modulo_poo_2.jogo_de_cartas;

public class CartaDeAtaqueEspecial extends CartaDeAtaque implements ICartaDeAtaque{
    private Efeito efeito;

    public CartaDeAtaqueEspecial(String nome, TipoDeCarta tipo, int custo, int poder, int resistencia, Efeito efeito) {
        super(nome, tipo, custo, poder, resistencia);
        this.efeito = efeito;
    }

    @Override
    public Efeito getEfeito() {
        return efeito;
    }
}
