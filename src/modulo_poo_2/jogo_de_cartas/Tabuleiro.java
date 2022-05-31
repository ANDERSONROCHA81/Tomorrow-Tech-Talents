package modulo_poo_2.jogo_de_cartas;

public interface Tabuleiro {
    void inserirDeck();
    void verificarCartaDeAtaque(CartaDeAtaque cartaDeAtaque);
    void verificarVencedor(Jogador jogador);
}
