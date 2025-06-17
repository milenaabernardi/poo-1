package jogo.modelo;

public class ElementoEsconderijo extends ElementoMina {
    public ElementoEsconderijo() {
        super('-');
    }

    @Override
    public String executar(Jogador jogador) {
        jogador.alterarPontuacao(-20);
        return jogador.getNome() + " entrou num esconderijo! -20 pontos!";
    }

    @Override
    public ElementoEsconderijo clone() {
        return new ElementoEsconderijo();
    }
}
