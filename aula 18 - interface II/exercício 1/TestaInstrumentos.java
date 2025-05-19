public class TestaInstrumentos {
    public static void sinfonia(Instrumento[] instrumentos) {
        for (Instrumento i : instrumentos) {
            i.nome();
            i.tocar();
            i.afinar();
            System.out.println("---------------");
        }
    }

    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[5];
        instrumentos[0] = new Sopro();
        instrumentos[1] = new Percussao();
        instrumentos[2] = new Corda();
        instrumentos[3] = new SoproMetal();
        instrumentos[4] = new SoproMadeira();

        sinfonia(instrumentos);
    }
}
