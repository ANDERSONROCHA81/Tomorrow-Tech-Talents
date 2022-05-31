package modulo_poo_2.jogo_de_cartas;

public class Jogador {
    private String nome;
    private int id;
    private int pontosDeVida;

    public Jogador(String nome, int id, int pontosDeVida) {
        this.nome = nome;
        this.id = id;
        this.pontosDeVida = pontosDeVida;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", pontosDeVida=" + pontosDeVida +
                '}';
    }
}
