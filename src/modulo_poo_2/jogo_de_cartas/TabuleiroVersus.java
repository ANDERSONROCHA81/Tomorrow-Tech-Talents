package modulo_poo_2.jogo_de_cartas;

public class TabuleiroVersus implements ITabuleiro{
    Carta[] deck1 = new Carta[50];
    Carta[] deck2 = new Carta[50];

    @Override
    public void inserirDeck() {
        
    }

    @Override
    public void verificarCartaDeAtaque(CartaDeAtaque cartaDeAtaque) {

    }

    @Override
    public void verificarVencedor(Jogador ... jogadores) {
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null && jogadores[i].getPontosDeVida() <= 0) {
                jogadores[i] = null;
            }
        }

        for (Jogador jogador : jogadores) {
            if (jogador != null && jogador.getPontosDeVida() > 0) {
                System.out.printf("O jogador %s venceu!\n", jogador.getNome());
            }
        }

    }
}
