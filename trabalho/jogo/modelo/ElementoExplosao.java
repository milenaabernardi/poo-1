package jogo.modelo;

public class ElementoExplosao extends ElementoMina {
    public ElementoExplosao() {
        super('X');
    }

    @Override
    public String executar(Jogador jogador) {
        jogador.alterarPontuacao(-15);
        jogador.setPularRodada(true);
        return jogador.getNome() + " foi atingido por uma explosão! -15 pontos e perde a próxima rodada!";
    }

    @Override
    public ElementoExplosao clone() {
        return new ElementoExplosao();
    }
}
