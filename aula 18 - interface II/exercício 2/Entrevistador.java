public class Entrevistador {
    private String idioma;

    public void entrevista(Falante f) {
        if (f instanceof Estudante) {
            System.out.println("Olá, Estudante!");
        } else if (f instanceof Robo) {
            System.out.println("Olá, Robo");
            Robo r = (Robo) f;
            r.reboot();
        }
        idioma = f.seuIdioma();
        f.falar();
        System.out.println("Vou entrevistar você em " + idioma);
    }
}
