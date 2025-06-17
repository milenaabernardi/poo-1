package jogo.modelo;

import java.util.Random;

public class Tabuleiro {
    private final int linhas;
    private final int colunas;
    private ElementoMina[][] mina;
    private final Random random = new Random();

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.mina = new ElementoMina[linhas][colunas];
        iniciarMina();
    }

    private void iniciarMina() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                mina[i][j] = new ElementoVazio(random.nextInt(10) + 1);
            }
        }

        adicionarAleatorios(new ElementoTunel(), 15);
        adicionarAleatorios(new ElementoEsconderijo(), 10);
        adicionarAleatorios(new ElementoPista(), 10);
        adicionarAleatorios(new ElementoTeleporte(), 5);
        adicionarAleatorios(new ElementoExplosao(), 8);
    }

    private void adicionarAleatorios(ElementoMina elemento, int quantidade) {
        int colocados = 0;
        while (colocados < quantidade) {
            int r = random.nextInt(linhas);
            int c = random.nextInt(colunas);
            if (mina[r][c] instanceof ElementoVazio) {
                mina[r][c] = elemento.clone();
                colocados++;
            }
        }
    }

    public ElementoMina getElemento(int linha, int coluna) {
        return mina[linha][coluna];
    }

    public void setElemento(int linha, int coluna, ElementoMina elemento) {
        mina[linha][coluna] = elemento;
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
                    System.out.print(" " + mina[i][j].getSimbolo() + " ");
                }
            }
            System.out.println("|");
        }
        System.out.println("   +" + "---".repeat(colunas) + "+\n");
    }
}
