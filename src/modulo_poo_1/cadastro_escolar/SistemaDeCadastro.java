package modulo_poo_1.cadastro_escolar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDeCadastro {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void listarFuncionarios() {
        funcionarios.forEach(System.out::println);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void listarProfessores() {
        professores.forEach(System.out::println);
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void removerFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void removerProfessor(Professor professor) {
        this.professores.remove(professor);
    }

    public void exibirDadosDoAluno(Aluno aluno) {
        if (this.alunos.contains(aluno)){
            System.out.println(aluno);
        }else {
            System.out.printf("O aluno %s não está cadastrado no sistema.\n", aluno.getNome());
        }
    }

    public void exibirDadosDoFuncionario(Funcionario funcionario) {
        if (this.funcionarios.contains(funcionario)){
            System.out.println(funcionario);
        }else {
            System.out.printf("O funcionário %s não está cadastrado no sistema.\n", funcionario.getNome());
        }
    }

    public void exibirDadosDoProfessor(Professor professor) {
        if (this.professores.contains(professor)){
            System.out.println(professor);
        }else {
            System.out.printf("O professor %s não está cadastrado no sistema.\n", professor.getNome());
        }
    }

    public void modificarAluno(Aluno aluno) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o novo nome:");
        aluno.setNome(entrada.nextLine());
        System.out.println("Informe o novo CPF:");
        aluno.setCpf(entrada.next());
        System.out.println("Informe o novo RG:");
        aluno.setRg(entrada.next());
        System.out.println("Informe a nova idade:");
        aluno.setIdade(entrada.nextInt());
    }

    public void modificarFuncionario(Funcionario funcionario) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o novo nome:");
        funcionario.setNome(entrada.nextLine());
        System.out.println("Informe o novo CPF:");
        funcionario.setCpf(entrada.next());
        System.out.println("Informe o novo RG:");
        funcionario.setRg(entrada.next());
        System.out.println("Informe o novo cargo:");
        funcionario.setCargo(entrada.nextLine());
        System.out.println("Informe o novo salário:");
        funcionario.setSalario(entrada.nextDouble());
    }

    public void modificarProfessor(Professor professor) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o novo nome:");
        professor.setNome(entrada.nextLine());
        System.out.println("Informe o novo CPF:");
        professor.setCpf(entrada.next());
        System.out.println("Informe o novo RG:");
        professor.setRg(entrada.next());
        System.out.println("Informe o novo cargo:");
        professor.setCargo(entrada.nextLine());
        System.out.println("Informe o novo salário:");
        professor.setSalario(entrada.nextDouble());
    }

    public void calcularMediaPorMateriaDosAlunos(){
        for (Aluno aluno : this.alunos) {
            for (Disciplina disciplina : aluno.getDisciplinas()) {
                System.out.printf("O aluno %s obteve notas %.1f e %.1f na matéria de %s e média %.1f\n",
                        aluno.getNome(), disciplina.getNota1(), disciplina.getNota2(), disciplina.getNomeDaDisciplina(), disciplina.calcularMedia());
            }
        }
    }
}
