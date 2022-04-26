package Lista01;

import java.util.Scanner;

/*
* Escreva um programa que com base em uma temperatura em graus
celsius, realize a conversão e exiba os resultados conforme as fórmulas
abaixo:
○ Kelvin
■ K = Celsius + 273.15;
○ Fahrenheit
■ F = Celsius * 1.8 + 32;
○ Rankine
■ Ra = Celsius * 1.8 + 32 + 459.67
○ Réaumur
■ Re = Celsius * 0.8;
*/

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma temperatura em Celsius:");
        double temperaturaEmCelsius = entrada.nextDouble();

        double temperaturaEmKelvin = temperaturaEmCelsius + 273.15;
        double temperaturaEmFahrenheit = temperaturaEmCelsius * 1.8 + 32;
        double temperaturaEmRankine = temperaturaEmCelsius * 1.8 + 32 + 459.67;
        double temperaturaEmReaumur = temperaturaEmCelsius * 0.8;

        System.out.printf("%.2fCº = %.2fKº\n", temperaturaEmCelsius, temperaturaEmKelvin);
        System.out.printf("%.2fCº = %.2fFº\n", temperaturaEmCelsius, temperaturaEmFahrenheit);
        System.out.printf("%.2fCº = %.2fRankineº\n", temperaturaEmCelsius, temperaturaEmRankine);
        System.out.printf("%.2fCº = %.2fReaumurº\n", temperaturaEmCelsius, temperaturaEmReaumur);
    }
}
