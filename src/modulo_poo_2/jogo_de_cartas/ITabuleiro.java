package modulo_poo_2.jogo_de_cartas;

public interface ITabuleiro {
    void inserirDeck();
    void verificarCartaDeAtaque(CartaDeAtaque cartaDeAtaque);
    void verificarVencedor(Jogador ... jogadores);
}
