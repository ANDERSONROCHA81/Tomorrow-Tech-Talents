package modulo_poo_1.cadastro_escolar;

public class Disciplina {
    private String nomeDaDisciplina;
    private double nota1;
    private double nota2;
    private double media;

    public Disciplina(String nomeDaDisciplina, double nota1, double nota2) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = 0;
    }

    public String getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public void setNomeDaDisciplina(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calculaMedia() {
        return (this.getNota1() + this.getNota2() / 2);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeDaDisciplina='" + nomeDaDisciplina + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", media=" + media +
                '}';
    }
}
