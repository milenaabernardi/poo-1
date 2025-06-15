package jogo.modelo;

/**
 * Interface para elementos interativos da mina.
 */
public interface ElementoAcao {
    /**
     * Executa a ação do elemento no jogador.
     *
     * @param jogador afetado
     * @return mensagem textual da ação
     */
    String executar(Jogador jogador);
}
