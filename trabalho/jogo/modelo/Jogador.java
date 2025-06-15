package jogo.modelo;

public class Jogador {
    private String nome;
    private String cor;
    private int pontuacao;
    private int linha;
    private int coluna;
    private boolean pularRodada;

    public Jogador(String nome, String cor, int linhaInicial, int colunaInicial) {
        this.nome = nome;
        this.cor = cor;
        this.linha = linhaInicial;
        this.coluna = colunaInicial;
        this.pontuacao = 0;
        this.pularRodada = false;
    }

    public String getNome() { return nome; }
    public String getCor() { return cor; }
    public int getPontuacao() { return pontuacao; }
    public int getLinha() { return linha; }
    public int getColuna() { return coluna; }
    public boolean isPularRodada() { return pularRodada; }

    public void mover(int novaLinha, int novaColuna) {
        this.linha = novaLinha;
        this.coluna = novaColuna;
    }

    public void alterarPontuacao(int valor) {
        this.pontuacao += valor;
    }

    public void setPularRodada(boolean valor) {
        this.pularRodada = valor;
    }

}
