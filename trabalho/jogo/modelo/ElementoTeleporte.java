package jogo.modelo;

import java.util.Random;

public class ElementoTeleporte extends ElementoMina {
    public ElementoTeleporte() {
        super('T');
    }

    @Override
    public String executar(Jogador jogador) {
        jogador.alterarPontuacao(5);
        Random rand = new Random();
        int novaLinha = rand.nextInt(10);
        int novaColuna = rand.nextInt(10);
        jogador.mover(novaLinha, novaColuna);
        return jogador.getNome() + " foi teleportado! +5 pontos!";
    }

    @Override
    public ElementoTeleporte clone() {
        return new ElementoTeleporte();
    }
}
