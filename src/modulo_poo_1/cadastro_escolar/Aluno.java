package modulo_poo_1.cadastro_escolar;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private int idade;
    private String turma;
    private List<Disciplina> disciplinas;

    public Aluno(String nome, String cpf, String rg, int idade, String turma) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.disciplinas = new ArrayList<>();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionaDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + ", " +
                "idade=" + idade +
                ", turma='" + turma + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
