package aula03;

/*
* Escreva um programa que leia e valide as seguintes informações:
● Nome: maior que 3 caracteres;
● Idade: entre 0 e 150
● Salário: maior que 0
● Sexo: ‘f’ ou ‘m’
● Estado civil: ‘s’, ‘c’, ‘v’, ‘d’*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true){
            System.out.println("Informe o seu nome:");
            String nome = entrada.nextLine();

            if (nome.length() > 3){
                System.out.println("Nome cadastrado com sucesso!");
                break;
            }else {
                System.out.println("O nome deve ser maior que 3 caracteres.");
            }
        }

        while (true){
            System.out.println("Informe a sua idade:");
            int idade = entrada.nextInt();

            if (idade > 0 && idade < 150){
                System.out.println("Idade cadastrada com sucesso!");
                break;
            }else {
                System.out.println("A idade deve ser maior que 0 e menor que 150 anos.");
            }
        }

        while (true){
            System.out.println("Informe o seu salário:");
            double salario = entrada.nextDouble();

            if (salario > 0){
                System.out.println("Salário cadastrado com sucesso!");
                break;
            }else {
                System.out.println("O salário deve ser maior que 0.");
            }
        }

        while (true){
            System.out.println("Informe o seu sexo:");
            char sexo = entrada.next().toLowerCase().charAt(0);

            if (sexo == 'm' || sexo == 'f'){
                System.out.println("Sexo cadastrado com sucesso!");
                break;
            }else {
                System.out.println("O sexo deve ser m ou f.");
            }
        }

        while (true){
            System.out.println("Informe o seu estado civil:");
            char estadoCivil = entrada.next().toLowerCase().charAt(0);

            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd'){
                System.out.println("Estado civil cadastrado com sucesso!");
                break;
            }else {
                System.out.println("O estado civil deve ser s, c, v ou d.");
            }
        }
    }
}
