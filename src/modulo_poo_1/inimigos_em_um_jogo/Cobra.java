package modulo_poo_1.inimigos_em_um_jogo;

public class Cobra extends Inimigo{
    @Override
    public void atacar() {
        System.out.println("Causou 10 de dano!");
        System.out.println("Seu personagem está envenenado!");
    }

    @Override
    public void apanhar(Ataque ataque, int dano) {
        if (ataque == Ataque.PANCADA){
            System.out.printf("Recebeu %d de dano!", dano * 2);
        }else {
            System.out.printf("Recebeu %d de dano!", dano);
        }
    }

    @Override
    public void interagir() {
        System.out.println("Se você acender a chama a maldição acaba!");
    }
}
