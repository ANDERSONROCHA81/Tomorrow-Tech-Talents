package modulo_poo_1.inimigos_em_um_jogo;

public class Vampiro extends Inimigo{
    @Override
    public void atacar() {
        System.out.println("Causou 20 de dano!");
        System.out.println("Seu personagem está sangrando!");
    }

    @Override
    public void apanhar(Ataque ataque, int dano) {
        if (ataque == Ataque.PERFURANTE){
            System.out.printf("Recebeu %d de dano!", dano * 2);
        }else {
            System.out.printf("Recebeu %d de dano!", dano);
        }
    }

    @Override
    public void interagir() {
        System.out.println("O que é um homem?");
    }
}
