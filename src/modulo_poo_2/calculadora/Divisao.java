package modulo_poo_2.calculadora;

public class Divisao implements Calculo{
    public double calcular(double ... valor) {
        double resultado = valor[0];
        if (valor.length == 1){
            resultado = valor[0];
        }else {
            for (int i = 1; i < valor.length; i++) {
                resultado /= valor[i];
            }
        }
        return resultado;
    }
}
