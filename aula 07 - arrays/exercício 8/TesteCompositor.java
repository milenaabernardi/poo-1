public class TesteCompositor {
    public static void main(String[] args) {

        Compositor compositor1 = new Compositor(1, "Milena");
        System.out.println("Compositor 1:");
        compositor1.exibirDados();

        System.out.println();

        Compositor[] compositores = new Compositor[2];
        compositores[0] = new Compositor(2, "Laura");
        compositores[1] = new Compositor(3, "Júlia");

        System.out.println("Compositores no vetor:");
        for (Compositor c : compositores) {
            c.exibirDados();
        }
    }
}

