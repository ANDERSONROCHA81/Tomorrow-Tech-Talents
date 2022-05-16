package modulo_poo_1.inimigos_em_um_jogo;

public class Gigante extends Inimigo{
    @Override
    public void atacar() {
        System.out.println("Causou 25 de dano!");
        System.out.println("Seu personagem está atordoado!");
    }

    @Override
    public void apanhar(Ataque ataque, int dano) {
        if (ataque == Ataque.FOGO){
            System.out.printf("Recebeu %d de dano!", dano * 2);
        }else {
            System.out.printf("Recebeu %d de dano!", dano);
        }
    }

    @Override
    public void interagir() {
        System.out.println("Me desculpe!");
    }
}
