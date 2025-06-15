package jogo.modelo;

import java.util.Random;

public class Tabuleiro {
    private final int linhas;
    private final int colunas;
    private TipoElemento[][] mina;
    private int[][] diamantes;
    private final Random random = new Random();

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.mina = new TipoElemento[linhas][colunas];
        this.diamantes = new int[linhas][colunas];
        iniciarTabuleiro();
    }

    private void iniciarTabuleiro() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                mina[i][j] = TipoElemento.VAZIO;
                diamantes[i][j] = random.nextInt(10) + 1;
            }
        }
        adicionarElementosAleatorios(TipoElemento.PROSSEGUIR, 10);
        adicionarElementosAleatorios(TipoElemento.TUNEL, 7);
        adicionarElementosAleatorios(TipoElemento.ESCONDERIJO, 8);
        adicionarElementosAleatorios(TipoElemento.TELEPORTE, 2);
        adicionarElementosAleatorios(TipoElemento.EXPLOSAO, 3);
    }

    private void adicionarElementosAleatorios(TipoElemento tipo, int quantidade) {
        int colocados = 0;
        while (colocados < quantidade) {
            int r = random.nextInt(linhas);
            int c = random.nextInt(colunas);
            if (mina[r][c] == TipoElemento.VAZIO) {
                mina[r][c] = tipo;
                colocados++;
            }
        }
    }

    public TipoElemento getElemento(int linha, int coluna) {
        return mina[linha][coluna];
    }

    public void setElemento(int linha, int coluna, TipoElemento tipo) {
        mina[linha][coluna] = tipo;
    }

    public int getDiamantes(int linha, int coluna) {
        return diamantes[linha][coluna];
    }

    public boolean posicaoValida(int linha, int coluna) {
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }

    public void exibir(java.util.List<Jogador> jogadores) {
        System.out.println("   +" + "---".repeat(colunas) + "+");

        for (int i = 0; i < linhas; i++) {
            System.out.print("   |");
            for (int j = 0; j < colunas; j++) {
                boolean temJogador = false;
                for (Jogador jogador : jogadores) {
                    if (jogador.getLinha() == i && jogador.getColuna() == j) {
                        System.out.print(jogador.getCor() + " J " + jogo.util.Cores.RESET);
                        temJogador = true;
                        break;
                    }
                }
                if (!temJogador) {
                    System.out.printf(" %c ", mina[i][j].getSimbolo());
                }
            }
            System.out.println("|");
        }

        System.out.println("   +" + "---".repeat(colunas) + "+\n");
    }
}
