package jogo.modelo;

public class ElementoVazio extends ElementoMina {
    private int valor;

    public ElementoVazio(int valor) {
        super('.');
        this.valor = valor;
    }

    @Override
    public String executar(Jogador jogador) {
        jogador.alterarPontuacao(valor);
        return jogador.getNome() + " encontrou " + valor + " quilates!";
    }

    @Override
    public ElementoVazio clone() {
        return new ElementoVazio(this.valor);
    }
}
