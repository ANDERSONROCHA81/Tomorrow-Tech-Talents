package modulo_poo_1.cadastro_escolar;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Anderson", "00125447855", "1445877", 40, new Turma("046"));
        Aluno aluno2 = new Aluno("Marcos", "14520236588", "4112566", 23, new Turma("235"));
        Aluno aluno3 = new Aluno("Felipe", "22312545699", "5889655", 34, new Turma("774"));
        Aluno aluno4 = new Aluno("Antônio", "85699685477", "3225414", 26, new Turma("856"));
        Aluno aluno5 = new Aluno("Gerson", "85633236599", "7458963", 32, new Turma("889"));

        Funcionario funcionario1 = new Funcionario("Adriano", "01023652147", "7778547", "Zelador", 1450.50);
        Funcionario funcionario2 = new Funcionario("Elder", "65236985633", "4775369", "Porteiro", 1800.00);
        Funcionario funcionario3 = new Funcionario("Maria", "58745214577", "8965221", "Zeladora", 1450.50);
        Funcionario funcionario4 = new Funcionario("Rosa", "85647128652", "7856632", "Cozinheira", 1574.45);
        Funcionario funcionario5 = new Funcionario("Katia", "54639452387", "5478931", "Diretora", 3500.90);

        Professor professor1 = new Professor("Mateus", "45875233658", "4447585", "Professor", 2450.00);
        Professor professor2 = new Professor("Rafael", "45236585447", "7841235", "Professor", 2450.00);
        Professor professor3 = new Professor("Miguel", "52365131235", "9135687", "Professor", 2450.00);
        Professor professor4 = new Professor("Tânia", "74589652145", "9712345", "Professora", 2450.00);
        Professor professor5 = new Professor("Zuleide", "69896365696", "6472398", "Professora", 2450.00);

        int opcao;
        while (true){
            System.out.println("=====Sistema de Cadastro Escolar=====");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Adicionar aluno\n2 - Adicionar funcionário\n3 - Adicionar professor\n" +
                    "4 - Editar aluno\n5 - Editar funcionário\n6 - Editar professor\n" +
                    "7 - Remover aluno\n8 - Remover funcionário\n8 - Remover professor\n" +
                    "9 - Listar alunos\n10 - Listar funcionários\n11 - Listar professores\n" +
                    "12 - Exibir dados do aluno\n13 - Exibir dados do funcionário\n14 - Exibir dados do professor\n");

            opcao = entrada.nextInt();

            if (opcao < 1 || opcao > 14){
                System.out.println("Até mais!");
                break;
            }
        }
    }
}
