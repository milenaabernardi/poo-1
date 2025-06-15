package jogo.modelo;

public enum TipoElemento {
    VAZIO('.'),
    TUNEL('O'),
    ESCONDERIJO('-'),
    PROSSEGUIR('+'),
    TELEPORTE('T'),
    EXPLOSAO('X'),
    RASTRO_JOGADOR('J');

    private final char simbolo;

    TipoElemento(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }
}
