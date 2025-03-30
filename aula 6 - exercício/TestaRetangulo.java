public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(13.4, 14.5);

        System.out.println("Retângulo 1:");
        r1.imprimeDados();

        System.out.println("\nRetângulo 2:");
        r2.imprimeDados();

        r1.setComprimento(-5);
        r1.setLargura(5);
        r1.setComprimento(5);

        System.out.println("\nRetângulo 1 após modificações:");
        r1.imprimeDados();
    }
}