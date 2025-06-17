package jogo.core;

import jogo.modelo.*;
import jogo.util.Cores;
import jogo.util.RankingUtil;
import java.util.*;

/**
 * Classe principal de controle do jogo Caçadores de Diamantes.
 * Controla fluxo do jogo, entrada do usuário e ranking persistente.
 * @author Milena
 * @version 1.0
 */

public class MotorJogo {
    private final int MAX_JOGADAS = 60;
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

        System.out.print("Quantos jogadores (2 a 4)? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        List<String> coresDisponiveis = new ArrayList<>(List.of(Cores.VERMELHO, Cores.VERDE, Cores.AMARELO, Cores.AZUL));

        for (int i = 0; i < num; i++) {
            System.out.print("Nome do Jogador " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            String cor = escolherCorManual(scanner, coresDisponiveis);

            Jogador jogador = new Jogador(nome, cor,
                    new Random().nextInt(LINHAS),
                    new Random().nextInt(COLUNAS));
            jogadores.add(jogador);
        }

        jogar(scanner);
    }

    private String escolherCorManual(Scanner scanner, List<String> coresDisponiveis) {
        System.out.println("Escolha uma cor:");
        for (int i = 0; i < coresDisponiveis.size(); i++) {
            System.out.println((i + 1) + " - " + coresDisponiveis.get(i) + "Cor" + Cores.RESET);
        }

        int escolha = 0;
        while (escolha < 1 || escolha > coresDisponiveis.size()) {
            System.out.print("Digite o número da cor desejada: ");
            try {
                escolha = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida.");
            }
        }

        return coresDisponiveis.remove(escolha - 1);
    }

    private void jogar(Scanner scanner) {
        int jogadas = 0;
        while (jogadas < MAX_JOGADAS) {
            for (Jogador jogador : jogadores) {
                if (jogadas >= MAX_JOGADAS) break;

                if (jogador.isPularRodada()) {
                    jogador.setPularRodada(false);
                    continue;
                }

                limparTela();
                tabuleiro.exibir(jogadores);
                exibirRanking();

                System.out.println(jogador.getCor() + "Vez de " + jogador.getNome() + Cores.RESET);
                System.out.print("Mover (w/a/s/d): ");
                String entrada = scanner.nextLine().toLowerCase();
                if (entrada.isEmpty()) continue;
                char direcao = entrada.charAt(0);

                int novaLinha = jogador.getLinha();
                int novaColuna = jogador.getColuna();

                switch (direcao) {
                    case 'w' -> novaLinha--;
                    case 's' -> novaLinha++;
                    case 'a' -> novaColuna--;
                    case 'd' -> novaColuna++;
                    default -> {
                        System.out.println("Comando inválido. Use w/a/s/d.");
                        System.out.println("Pressione Enter para continuar...");
                        scanner.nextLine();
                        continue;
                    }
                }

                if (!tabuleiro.posicaoValida(novaLinha, novaColuna)) {
                    System.out.println("Movimento fora da mina! Tente outra direção.");
                    System.out.println("Pressione Enter para continuar...");
                    scanner.nextLine();
                    continue;
                }

                ElementoMina elemento = tabuleiro.getElemento(novaLinha, novaColuna);
                String mensagem = elemento.executar(jogador);

                jogador.mover(novaLinha, novaColuna);


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
        System.out.println("\n--- Ranking Atual ---");
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
        System.out.println("\n🏆 Vencedor: " + vencedor.getCor() + vencedor.getNome() + Cores.RESET + " com " + vencedor.getPontuacao() + " pontos!");
    }

    private void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}