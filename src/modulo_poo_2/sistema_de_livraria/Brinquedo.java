package modulo_poo_2.sistema_de_livraria;

public class Brinquedo extends Produto{
    private String tipo;

    public Brinquedo(String nome, double preco, int quantidade, String tipo) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo{" + super.toString() +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
