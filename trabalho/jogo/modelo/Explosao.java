package jogo.modelo;

public class Explosao extends ElementoMina {
    public Explosao() {
        super('X');
    }

    @Override
    public String executar(Jogador jogador) {
        jogador.alterarPontuacao(-15);
        jogador.setPularRodada(true);
        return jogador.getNome() + " foi atingido por uma explosão!";
    }
}
