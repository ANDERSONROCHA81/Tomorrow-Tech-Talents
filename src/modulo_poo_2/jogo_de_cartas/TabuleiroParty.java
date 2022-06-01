package modulo_poo_2.jogo_de_cartas;

public class TabuleiroParty implements ITabuleiro{
    Carta[] deck1 = new Carta[80];
    Carta[] deck2 = new Carta[80];
    Carta[] deck3 = new Carta[80];
    Carta[] deck4 = new Carta[80];
    Carta[] deck5 = new Carta[80];

    @Override
    public void inserirDeck() {
        //Não implementei por não ter o conhecimento necessário de como funciona o jogo.
    }

    @Override
    public void verificarCartaDeAtaque(CartaDeAtaque cartaDeAtaque) {
        //Não implementei por não ter o conhecimento necessário de como funciona o jogo.
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
