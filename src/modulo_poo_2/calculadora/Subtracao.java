package modulo_poo_2.calculadora;

public class Subtracao implements Calculo{
    @Override
    public double calcular(double ... valor) {
        double resultado = 0;
        for (double numero : valor) {
            resultado -= numero;
        }
        return resultado;
    }
}
