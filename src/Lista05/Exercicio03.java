package Lista05;

/*
* Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
○ “Telefonou para a vítima? “
○ “Esteve no local do crime?”
○ “Mora perto da vítima? “
○ “Devia para a vítima? “
○ “Já trabalhou com a vítima? “*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtdSim = 0;
        int qtdNao = 0;
        String resposta;

        System.out.println("Responda com sim ou não, as perguntas do interrogatório sobre um crime:");
        System.out.println("Você telefonou para a vítima?");
        resposta = entrada.next();
        if (resposta.equalsIgnoreCase("Sim")){
            qtdSim++;
        } else if (resposta.equalsIgnoreCase("Não")) {
            qtdNao++;
        }

        System.out.println("Você esteve no local do crime?");
        resposta = entrada.next();
        if (resposta.equalsIgnoreCase("Sim")){
            qtdSim++;
        } else if (resposta.equalsIgnoreCase("Não")) {
            qtdNao++;
        }

        System.out.println("Você mora perto da vítima?");
        resposta = entrada.next();
        if (resposta.equalsIgnoreCase("Sim")){
            qtdSim++;
        } else if (resposta.equalsIgnoreCase("Não")) {
            qtdNao++;
        }

        System.out.println("Você devia para a vítima?");
        resposta = entrada.next();
        if (resposta.equalsIgnoreCase("Sim")){
            qtdSim++;
        } else if (resposta.equalsIgnoreCase("Não")) {
            qtdNao++;
        }

        System.out.println("Você já trabalhou com a vítima?");
        resposta = entrada.next();
        if (resposta.equalsIgnoreCase("Sim")){
            qtdSim++;
        } else if (resposta.equalsIgnoreCase("Não")) {
            qtdNao++;
        }

        if (qtdSim > qtdNao){
            System.out.println("Você é o culpado!");
        }else {
            System.out.println("Você é inocente!");
        }
    }
}
