public class TestaFalantes {
    public static void main(String[] args) {
        Falante f1, f2;
        f1 = new Estudante("Manoel", 22);
        f2 = new Robo();

        Entrevistador e = new Entrevistador();

        e.entrevista(f1);
        System.out.println("-------------");
        e.entrevista(f2);
    }
}
