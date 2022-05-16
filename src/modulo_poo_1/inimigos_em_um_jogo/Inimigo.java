package modulo_poo_1.inimigos_em_um_jogo;

public abstract class Inimigo {
    public void atacar(){
        System.out.println("Causou 10 de dano!");
    }

    public void apanhar(int dano){
        System.out.printf("Recebeu %d de dano!", dano);
    }

    public abstract void apanhar(Ataque ataque, int dano);

    public void interagir(){
        System.out.println("Por que eu responderia meu inimigo???");
    }
}
