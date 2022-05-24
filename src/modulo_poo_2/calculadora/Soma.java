package modulo_poo_2.calculadora;

public class Soma implements Calculo{
    @Override
    public double calcular(double ... valor) {
        double soma = 0;
        for (double numero : valor) {
            soma += numero;
        }
        return soma;
    }
}
