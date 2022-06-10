package modulo_poo_2.sistema_de_livraria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int rg;
    private String cpf;
    private LocalDate dataDeNascimento;
    private List<Produto> produtosComprados;

    public Cliente(String nome, int rg, String cpf, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        produtosComprados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public List<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    public void adicionarProduto(Produto produto) {
        this.produtosComprados.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtosComprados.remove(produto);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", rg=" + rg +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", produtosComprados=" + produtosComprados +
                '}';
    }
}
