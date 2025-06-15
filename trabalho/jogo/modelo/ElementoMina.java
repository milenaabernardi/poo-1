package jogo.modelo;

public abstract class ElementoMina implements ElementoAcao {
    private final char simbolo;

    public ElementoMina(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public abstract String executar(Jogador jogador);
}
