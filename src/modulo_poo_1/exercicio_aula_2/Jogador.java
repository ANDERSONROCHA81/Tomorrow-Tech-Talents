package modulo_poo_1.exercicio_aula_2;

import java.security.SecureRandom;
import java.time.LocalDate;

public class Jogador {
    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    boolean suspenso;

    int qtdTreinamentos = 0;

    public Jogador() {
    }

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade, int cartoesAmarelos, int cartaoVermelho, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = Math.max(qualidade, 0);
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = suspenso;
    }

    boolean verificarCondicaoDeJogo() {
        if (this.cartoesAmarelos >= 3 || this.cartaoVermelho == 1){
            this.suspenso = true;
        }
        return suspenso;
    }

    void aplicarCartaoAmarelo(int quantidade){
        this.cartoesAmarelos = quantidade;
    }

    void aplicarCartaoVermelho(){
        this.cartaoVermelho = 1;
    }

    void cumprirSuspencao(){
        System.out.printf("Jogador %s está cumprindo suspensão.\n", this.nome);
        this.cartoesAmarelos = 0;
        this.cartaoVermelho = 0;
        this.suspenso = false;
    }

    void sofrerLesao(){
        SecureRandom numeroAleatorio = new SecureRandom();
        int lesao = numeroAleatorio.nextInt(1, 41);

        if (lesao == 5) {
            this.qualidade -= 0.15 * this.qualidade;
        } else if (lesao == 10) {
            this.qualidade -= 0.10 * this.qualidade;
        } else if (lesao == 15) {
            this.qualidade -= 0.05 * this.qualidade;
        } else if (lesao == 30) {
            this.qualidade -= 2;
        } else if (lesao == 40) {
            this.qualidade -= 1;
        }

        if (this.qualidade < 0) {
            this.qualidade = 0;
        }
    }

    void executarTreinamento(){
        if (this.qtdTreinamentos == 0){
            SecureRandom numeroAleatorio = new SecureRandom();
            int aumentoDaQualidade = numeroAleatorio.nextInt(1, 4);
            this.qualidade += aumentoDaQualidade;
            qtdTreinamentos++;
        }else{
            System.out.printf("Impossível o jogador %s realizar outro treinamento!\n", this.nome);
        }

    }

    @Override
    public String toString() {
        return String.format("%s: %d - %s (%s) - %s CONDIÇÃO: %s", this.posicao, this.numero, this.nome, this.apelido, this.dataNascimento, this.verificarCondicaoDeJogo() ? "NÃO PODE JOGAR" : "PODE JOGAR");
    }
}
