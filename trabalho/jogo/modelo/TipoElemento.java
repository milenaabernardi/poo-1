package jogo.modelo;

public enum TipoElemento {
    VAZIO('.'),
    TUNEL('O'),
    ESCONDERIJO('-'),
    PROSSEGUIR('+'),
    TELEPORTE('T'),
    EXPLOSAO('X');

    private final char simbolo;

    TipoElemento(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }
}
