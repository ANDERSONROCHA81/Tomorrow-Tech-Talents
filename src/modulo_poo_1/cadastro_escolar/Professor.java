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

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void removerTurma(String codigoDaTurma) {
        boolean temTurma = false;

        for (Turma turma : this.turmas) {
            if (turma.getCodigo().equalsIgnoreCase(codigoDaTurma)) {
                this.turmas.remove(turma);
                temTurma = true;
                break;
            }
        }

        if (!temTurma){
            System.out.printf("O professor %s não leciona a turma com código %s.\n", this.getNome(), codigoDaTurma);
        }
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removerDisciplina(String nomeDaDisciplina) {
        boolean temDisciplina = false;

        for (Disciplina disciplina : this.disciplinas) {
            if (disciplina.getNomeDaDisciplina().equalsIgnoreCase(nomeDaDisciplina)) {
                this.disciplinas.remove(disciplina);
                temDisciplina = true;
                break;
            }
        }

        if (!temDisciplina){
            System.out.printf("O professor %s não leciona a disciplina de %s.\n", this.getNome(), nomeDaDisciplina);
        }
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + ", " +
                "turmas=" + turmas +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
