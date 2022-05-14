package modulo_poo_1.cadastro_escolar;


public class Escola {
    public static void main(String[] args) {

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

        SistemaDeCadastro sistema = new SistemaDeCadastro();

        sistema.adicionarAluno(aluno1);
        sistema.adicionarAluno(aluno2);
        sistema.adicionarAluno(aluno3);
        sistema.adicionarAluno(aluno4);
        sistema.adicionarAluno(aluno5);

        sistema.adicionarFuncionario(funcionario1);
        sistema.adicionarFuncionario(funcionario2);
        sistema.adicionarFuncionario(funcionario3);
        sistema.adicionarFuncionario(funcionario4);
        sistema.adicionarFuncionario(funcionario5);

        sistema.adicionarProfessor(professor1);
        sistema.adicionarProfessor(professor2);
        sistema.adicionarProfessor(professor3);
        sistema.adicionarProfessor(professor4);
        sistema.adicionarProfessor(professor5);

        System.out.println("Alunos, funcionários e professores cadastrados no sistema:");
        sistema.listarAlunos();
        sistema.listarFuncionarios();
        sistema.listarProfessores();

        aluno1.adicionarDisciplina(new Disciplina("Matemática", 4.5, 2.9));
        aluno1.adicionarDisciplina(new Disciplina("Português", 9.0, 5.4));
        aluno2.adicionarDisciplina(new Disciplina("Física", 5.0, 3.4));
        aluno2.adicionarDisciplina(new Disciplina("Química", 5.6, 8.9));
        aluno3.adicionarDisciplina(new Disciplina("Sociologia", 7.9, 5.9));
        aluno3.adicionarDisciplina(new Disciplina("Filosofia", 1.0, 10.0));
        aluno4.adicionarDisciplina(new Disciplina("Ciências", 8.5, 4.8));
        aluno4.adicionarDisciplina(new Disciplina("Geografia", 7.4, 9.6));
        aluno5.adicionarDisciplina(new Disciplina("História", 3.5, 8.3));
        aluno5.adicionarDisciplina(new Disciplina("Literatura", 1.9, 7.2));

        System.out.println("\n\nAlunos com as disciplinas adicionadas:");
        sistema.listarAlunos();

        System.out.println("\n\nCálculo das médias das disciplinas:");
        sistema.calcularMediaPorMateriaDosAlunos();

        System.out.println("\n\nAlunos com o resultado das médias das disciplinas :");
        sistema.listarAlunos();

        professor1.adicionarTurma(new Turma("01a"));
        professor1.adicionarTurma(new Turma("457"));
        professor2.adicionarTurma(new Turma("5ty"));
        professor2.adicionarTurma(new Turma("fre"));
        professor3.adicionarTurma(new Turma("887"));
        professor3.adicionarTurma(new Turma("r45"));
        professor4.adicionarTurma(new Turma("78u"));
        professor4.adicionarTurma(new Turma("4es"));
        professor5.adicionarTurma(new Turma("io9"));
        professor5.adicionarTurma(new Turma("qa2"));

        professor1.adicionarDisciplina(new Disciplina("Matemática"));
        professor1.adicionarDisciplina(new Disciplina("Física"));
        professor2.adicionarDisciplina(new Disciplina("Português"));
        professor2.adicionarDisciplina(new Disciplina("Geografia"));
        professor3.adicionarDisciplina(new Disciplina("Química"));
        professor3.adicionarDisciplina(new Disciplina("Literatura"));
        professor4.adicionarDisciplina(new Disciplina("Sociologia"));
        professor4.adicionarDisciplina(new Disciplina("Filosofia"));
        professor5.adicionarDisciplina(new Disciplina("Ciências"));
        professor5.adicionarDisciplina(new Disciplina("História"));

        System.out.println("\n\nAdição de turmas e disciplinas dos professores:");
        sistema.listarProfessores();

        System.out.printf("\n\nExibição dos dados do aluno %s:\n", aluno1.getNome());
        sistema.exibirDadosDoAluno(aluno1);

        System.out.printf("\nExibição dos dados do funcionário %s:\n", funcionario3.getNome());
        sistema.exibirDadosDoFuncionario(funcionario3);

        System.out.printf("\nExibição dos dados do professor %s:\n", professor5.getNome());
        sistema.exibirDadosDoProfessor(professor5);

        sistema.removerAluno(aluno2);
        sistema.removerFuncionario(funcionario1);
        sistema.removerProfessor(professor4);

        System.out.println("\n\nAlunos restantes:");
        sistema.listarAlunos();

        System.out.println("\n\nFuncionários restantes:");
        sistema.listarFuncionarios();

        System.out.println("\n\nProfessores restantes:");
        sistema.listarProfessores();
    }
}
