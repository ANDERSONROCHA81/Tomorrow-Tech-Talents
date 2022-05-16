package modulo_poo_1.inimigos_em_um_jogo;

import java.security.SecureRandom;

public class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    private void setVida(int vida) {
        this.vida = vida;
    }

    public void recuperarVida(){
        SecureRandom valor = new SecureRandom();
        this.setVida(valor.nextInt(1, 31));
    }

    @Override
    public String toString() {
        return this.getVida() > 0 ? String.format("%s ainda possui %d de vida!",this.getNome(), this.getVida())
                : String.format("%s está morto!", this.getNome());
    }
}
