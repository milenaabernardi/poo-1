package jogo.modelo;

public class Vazio extends ElementoMina {
    private final int valor;

    public Vazio(int valor) {
        super('.');
        this.valor = valor;
    }

    @Override
    public String executar(Jogador jogador) {
        jogador.alterarPontuacao(valor);
        return jogador.getNome() + " encontrou " + valor + " quilates!";
    }
}
