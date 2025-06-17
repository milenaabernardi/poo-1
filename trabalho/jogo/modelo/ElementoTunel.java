package jogo.modelo;

public class ElementoTunel extends ElementoMina {
    public ElementoTunel() {
        super('O');
    }

    @Override
    public String executar(Jogador jogador) {
        jogador.alterarPontuacao(-10);
        return jogador.getNome() + " caiu em um túnel! -10 pontos!";
    }

    @Override
    public ElementoTunel clone() {
        return new ElementoTunel();
    }
}
