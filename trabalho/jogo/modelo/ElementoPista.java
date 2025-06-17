package jogo.modelo;

public class ElementoPista extends ElementoMina {
    public ElementoPista() {
        super('+');
    }

    @Override
    public String executar(Jogador jogador) {
        jogador.alterarPontuacao(5);
        return jogador.getNome() + " encontrou uma pista! +5 pontos!";
    }

    @Override
    public ElementoPista clone() {
        return new ElementoPista();
    }
}
