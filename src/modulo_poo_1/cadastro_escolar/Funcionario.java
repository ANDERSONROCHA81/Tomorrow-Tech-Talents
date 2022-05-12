package modulo_poo_1.cadastro_escolar;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String rg, String cargo, double salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        if (salario < 0){
            this.salario = 0;
        }
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + super.toString() + ", " +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
