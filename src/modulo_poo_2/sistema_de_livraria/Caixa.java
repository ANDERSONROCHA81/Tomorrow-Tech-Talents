package modulo_poo_2.sistema_de_livraria;

public class Caixa implements ICaixa {

    private double dinheiroNoCaixa = 0.0;
    @Override
    public void adicionarDinheiroAoCaixa(double valor) {
        this.dinheiroNoCaixa += valor;
    }

    @Override
    public void mostrarDinheiroNoCaixa() {
        System.out.printf("O valor contido no caixa é de R$ %.2f%n", this.dinheiroNoCaixa);
    }
}
