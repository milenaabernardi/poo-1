package jogo.modelo;

/**
 * Elemento abstrato da mina.
 */
public abstract class ElementoMina {
    private final char simbolo;

    public ElementoMina(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    /**
     * Executa a ação do elemento no jogador.
     * @param jogador Jogador afetado
     * @return mensagem de resultado
     */
    public abstract String executar(Jogador jogador);
}
