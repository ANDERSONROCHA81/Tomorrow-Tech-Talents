package modulo_poo_1.cadastro_escolar;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario{
    private List<Turma> turmas;
    private List<Disciplina> disciplinas;

    public Professor(String nome, String cpf, String rg, String cargo, double salario) {
        super(nome, cpf, rg, cargo, salario);
        this.turmas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionaTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionaDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + ", " +
                "turmas=" + turmas +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
