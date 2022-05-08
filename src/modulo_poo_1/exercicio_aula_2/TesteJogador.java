package modulo_poo_1.exercicio_aula_2;

import java.time.LocalDate;
import java.time.Month;

public class TesteJogador {
    public static void main(String[] args) {
        Jogador[] jogadores = {new Jogador(100, "Mauro", "Mau", LocalDate.of(2000, Month.APRIL, 15), 1, "Goleiro", 100, 0, 0, false),
            new Jogador(200, "Flávio", "Fla", LocalDate.of(1999, Month.AUGUST, 23), 2, "Zagueiro", 75, 1, 0, false),
            new Jogador(300, "Pedro", "Pepê", LocalDate.of(2001, Month.DECEMBER, 4), 3, "Zagueiro", 80, 0, 0, false),
            new Jogador(400, "Vítor", "Vi", LocalDate.of(1998, Month.JANUARY, 16), 6, "Lateral Esquerdo", 85, 0, 0, false),
            new Jogador(500, "Andrade", "Cabeça", LocalDate.of(1995, Month.FEBRUARY, 28), 4, "Lateral Direito", 90, 2, 0, false),
            new Jogador(600, "Túlio", "Teto", LocalDate.of(2002, Month.MARCH, 13), 8, "Meio Campo", 93, 1, 0, false),
            new Jogador(700, "Souza", "Chapa", LocalDate.of(2005, Month.JULY, 22), 12, "Meio Campo", 78, 0, 0, false),
            new Jogador(800, "Nunes", "Teco", LocalDate.of(2006, Month.MAY, 7), 15, "Meio Campo", 58, 0, 0, false),
            new Jogador(900, "Miguel", "Flecha", LocalDate.of(2001, Month.FEBRUARY, 15), 7, "Atacante", 99, 0, 0, false),
            new Jogador(1000, "Rafael", "Farrel", LocalDate.of(2008, Month.SEPTEMBER, 20), 10, "Atacante", 96, 0, 0, false),
            new Jogador(1100, "Anderson", "Munga", LocalDate.of(1981, Month.JUNE, 17), 11, "Atacante", 94, 0, 0, false),
        };

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].executarTreinamento();
        }

        jogadores[5].executarTreinamento();
        jogadores[1].executarTreinamento();
        jogadores[3].executarTreinamento();

        jogadores[4].aplicarCartaoAmarelo(1);
        jogadores[8].aplicarCartaoAmarelo(3);
        jogadores[6].aplicarCartaoVermelho();
        jogadores[2].aplicarCartaoVermelho();

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i]);
        }

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].sofrerLesao();
        }

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].sofrerLesao();
        }

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].verificarCondicaoDeJogo();
            if (jogadores[i].suspenso){
                jogadores[i].cumprirSuspencao();
            }
        }

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i]);
        }
    }
}
