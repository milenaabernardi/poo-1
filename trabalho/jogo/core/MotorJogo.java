package jogo.core;

import jogo.modelo.*;
import jogo.util.Cores;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MotorJogo {
    private final int MAX_JOGADAS = 100;
    private final int LINHAS = 10;
    private final int COLUNAS = 10;
    private Tabuleiro tabuleiro;
    private List<Jogador> jogadores;

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        this.jogadores = new ArrayList<>();
        this.tabuleiro = new Tabuleiro(LINHAS, COLUNAS);

        System.out.println("Quantos jogadores (2 a 4)? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Nome do Jogador " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            String cor = escolherCor(i);
            Jogador j = new Jogador(nome, cor, new Random().nextInt(LINHAS), new Random().nextInt(COLUNAS));
            jogadores.add(j);
        }

        jogar(scanner);
    }

    private String escolherCor(int index) {
        return switch (index) {
            case 0 -> Cores.VERMELHO;
            case 1 -> Cores.VERDE;
            case 2 -> Cores.AMARELO;
            case 3 -> Cores.AZUL;
            default -> Cores.RESET;
        };
    }

    private void jogar(Scanner scanner) {
        int jogadas = 0;
        while (jogadas < MAX_JOGADAS) {
            for (Jogador jogador : jogadores) {
                if (jogador.isPularRodada()) {
                    jogador.setPularRodada(false);
                    continue;
                }

                limparTela();
                tabuleiro.exibir(jogadores);
                exibirRanking();

                System.out.println(jogador.getCor() + "Vez de " + jogador.getNome() + Cores.RESET);
                System.out.print("Mover (w/a/s/d): ");
                char direcao = scanner.nextLine().toLowerCase().charAt(0);

                int novaLinha = jogador.getLinha();
                int novaColuna = jogador.getColuna();

                switch (direcao) {
                    case 'w' -> novaLinha--;
                    case 's' -> novaLinha++;
                    case 'a' -> novaColuna--;
                    case 'd' -> novaColuna++;
                }

                if (!tabuleiro.posicaoValida(novaLinha, novaColuna)) continue;

                TipoElemento destino = tabuleiro.getElemento(novaLinha, novaColuna);
                jogador.mover(novaLinha, novaColuna);

                switch (destino) {
                    case VAZIO -> jogador.alterarPontuacao(tabuleiro.getDiamantes(novaLinha, novaColuna));
                    case TUNEL -> jogador.alterarPontuacao(-10);
                    case ESCONDERIJO -> jogador.alterarPontuacao(-20);
                    case PROSSEGUIR -> jogador.alterarPontuacao(5);
                    case TELEPORTE -> {
                        jogador.alterarPontuacao(5);
                        int novaL, novaC;
                        do {
                            novaL = new Random().nextInt(LINHAS);
                            novaC = new Random().nextInt(COLUNAS);
                        } while (tabuleiro.getElemento(novaL, novaC) != TipoElemento.VAZIO);
                        jogador.mover(novaL, novaC);
                    }
                    case EXPLOSAO -> {
                        jogador.alterarPontuacao(-15);
                        jogador.setPularRodada(true);
                    }
                }

                jogadas++;
            }
        }

        exibirRanking();
        declararVencedor();
    }

    private void exibirRanking() {
        System.out.println("\n--- Ranking ---");
        for (Jogador j : jogadores) {
            System.out.println(j.getCor() + j.getNome() + ": " + j.getPontuacao() + " pontos" + Cores.RESET);
        }
    }

    private void declararVencedor() {
        Jogador vencedor = jogadores.get(0);
        for (Jogador j : jogadores) {
            if (j.getPontuacao() > vencedor.getPontuacao()) {
                vencedor = j;
            }
        }
        System.out.println("\n🏆 Vencedor: " + vencedor.getCor() + vencedor.getNome() + Cores.RESET);
    }

    private void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
