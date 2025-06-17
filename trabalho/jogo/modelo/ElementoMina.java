package jogo.modelo;

/**
 * Representa um elemento da mina.
 * Deve implementar clone() para inserção dinâmica no tabuleiro.
 */

public abstract class ElementoMina implements Cloneable {
    private final char simbolo;

    public ElementoMina(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public abstract String executar(Jogador jogador);

    @Override
    public ElementoMina clone() {
        try {
            return (ElementoMina) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone falhou em ElementoMina");
        }
    }
}
