package modulo_poo_1.inimigos_em_um_jogo;

public class Inimigo {
    public void atacar(){
        System.out.println("Causou 10 de dano!");
    }

    public void apanhar(Ataque ataque){
        System.out.printf("Recebeu %d de dano");
    }

    public void interagir(){
        System.out.println("Por que eu responderia meu inimigo???");
    }
}
