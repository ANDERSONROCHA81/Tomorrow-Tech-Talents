package modulo_poo_2.jogo_de_cartas;

public interface ICarta {
    String getNome();
    TipoDeCarta getTipo();
    int getCusto();
    int getPoder();
    int getResistencia();
}
