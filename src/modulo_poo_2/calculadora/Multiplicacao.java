package modulo_poo_2.calculadora;

public class Multiplicacao implements Calculo{
    public double calcular(double ... valor) {
        double resultado = 1;
        for (double numero : valor) {
            resultado *= numero;
        }
        return resultado;
    }
}
