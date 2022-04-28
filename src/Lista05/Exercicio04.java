package Lista05;

/*
* Leia a velocidade máxima permitida em uma avenida e a velocidade
com que o motorista estava dirigindo nela e calcule a multa que uma
pessoa vai receber, sabendo que são pagos:
a) 50 reais se o motorista estiver ultrapassar em até 10km/h a
velocidade permitida (ex.: velocidade máxima: 50km/h; motorista a
60km/h ou a 56km/h);
b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a
velocidade permitida.
c) 200 reais, se estiver igual ou acima de 31km/h da velocidade permitida.*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a velocidade máxima, em Km/h, permitida nessa avenida:");
        double velocidadeMaximaPermitida = entrada.nextDouble();

        System.out.println("Informe a velocidade, em Km/h, que o motorista estava dirigindo:");
        double velocidadeDoCarro = entrada.nextDouble();

        double multa = 0;

        if (velocidadeDoCarro > velocidadeMaximaPermitida && velocidadeDoCarro <= velocidadeMaximaPermitida + 10){
            multa = 50.00;
        } else if (velocidadeDoCarro >= velocidadeMaximaPermitida + 11 && velocidadeDoCarro <= velocidadeMaximaPermitida + 30) {
            multa = 100.00;
        } else if (velocidadeDoCarro >= velocidadeMaximaPermitida + 31) {
            multa = 200.00;
        }

        if (multa != 0){
            System.out.printf("Sua multa será de R$ %.2f, pois você ultrapassou a velocidade permitida em %.2f Km/h\n", multa, velocidadeDoCarro - velocidadeMaximaPermitida);
        }else {
            System.out.println("Sem multa, pois não houve infração.");
        }
    }
}
