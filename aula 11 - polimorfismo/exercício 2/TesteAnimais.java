public class TesteAnimais {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro(),
                new Gato(),
                new Preguica()
        };

        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}