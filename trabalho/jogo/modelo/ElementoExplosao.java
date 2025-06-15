package jogo.modelo;

public class ElementoExplosao extends ElementoMina {
    public ElementoExplosao() {
        super('X');
    }

    @Override
    public String executar(Jogador jogador) {
        jogador.alterarPontuacao(-15);
        jogador.setPularRodada(true);
        return jogador.getNome() + " pisou em uma explosão! -15 pontos e perde a próxima rodada!";
    }
}
