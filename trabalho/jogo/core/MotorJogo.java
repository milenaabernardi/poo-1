package jogo.core;

import jogo.modelo.*;
import jogo.util.Cores;
import jogo.util.RankingUtil;
import java.util.*;

/**
 * Classe responsável por controlar o fluxo principal do jogo.
 * Adaptado para exibir mensagens de ação e permitir escolha de cores.
 * @author Milena
 * @version 1.0
 */

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

        System.out.println("=== BEM-VINDO(A) AO CAÇADORES DE DIAMANTES ===");
        RankingUtil.exibirRankingAnterior();

        System.out.println("Quantos jogadores (2 a 4)? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        List<String> coresDisponiveis = new ArrayList<>(List.of(
                Cores.VERMELHO, Cores.VERDE, Cores.AMARELO, Cores.AZUL
        ));

        for (int i = 0; i < num; i++) {
            System.out.print("Nome do Jogador " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            String cor = escolherCorManual(scanner, coresDisponiveis);

            Jogador j = new Jogador(nome, cor, new Random().nextInt(LINHAS), new Random().nextInt(COLUNAS));
            jogadores.add(j);
        }

        jogar(scanner);
    }

    private String escolherCorManual(Scanner scanner, List<String> coresDisponiveis) {
        System.out.println("Escolha uma cor:");

        for (int i = 0; i < coresDisponiveis.size(); i++) {
            String cor = coresDisponiveis.get(i);
            System.out.println((i + 1) + " - " + cor + "Cor" + Cores.RESET);
        }

        int escolha = 0;
        while (escolha < 1 || escolha > coresDisponiveis.size()) {
            System.out.print("Digite o número da cor desejada: ");
            try {
                escolha = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }

        return coresDisponiveis.remove(escolha - 1);
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

                String mensagem = "";

                switch (destino) {
                    case VAZIO -> {
                        int valor = tabuleiro.getDiamantes(novaLinha, novaColuna);
                        jogador.alterarPontuacao(valor);
                        mensagem = jogador.getCor() + jogador.getNome() + " encontrou " + valor + " quilates de diamantes!" + Cores.RESET;
                    }
                    case TUNEL -> {
                        jogador.alterarPontuacao(-10);
                        mensagem = jogador.getCor() + jogador.getNome() + " caiu em um túnel! -10 pontos!" + Cores.RESET;
                    }
                    case ESCONDERIJO -> {
                        jogador.alterarPontuacao(-20);
                        mensagem = jogador.getCor() + jogador.getNome() + " entrou num esconderijo perigoso! -20 pontos!" + Cores.RESET;
                    }
                    case PROSSEGUIR -> {
                        jogador.alterarPontuacao(5);
                        mensagem = jogador.getCor() + jogador.getNome() + " achou uma pista! +5 pontos!" + Cores.RESET;
                    }
                    case TELEPORTE -> {
                        jogador.alterarPontuacao(5);
                        mensagem = jogador.getCor() + jogador.getNome() + " ativou um teleporte! +5 pontos!" + Cores.RESET;
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
                        mensagem = jogador.getCor() + jogador.getNome() + " foi atingido por uma explosão! -15 pontos e perde a próxima rodada!" + Cores.RESET;
                    }
                }

                jogadas++;

                System.out.println("\n" + mensagem);
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
            }
        }

        exibirRanking();
        declararVencedor();
        RankingUtil.salvarRanking(jogadores);
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
