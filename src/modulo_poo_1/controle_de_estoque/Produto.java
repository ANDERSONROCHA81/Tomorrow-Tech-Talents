package modulo_poo_1.controle_de_estoque;

public class Produto {
    private String nome;
    private String sessao;
    private String tipo;
    private int quantidade;
    private String marca;
    private static int identificador = 0;

    public Produto() {
        incrementaIdentificador();
    }

    private static void incrementaIdentificador(){
        identificador++;
    }

    public static int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
