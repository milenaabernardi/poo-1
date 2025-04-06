public class Shapes {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        t1.setLargura(4.0);
        t1.setAltura(4.0);
        t1.setEstilo("cheio");
        t2.setLargura(8.0);
        t2.setAltura(12.0);
        t2.setEstilo("contorno");
        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Área = " + t1.area());
        System.out.println();
        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Área = " + t2.area());

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();
        System.out.println("\nInfo de r1");
        r1.setAltura(5.5);
        r1.setLargura(5.7);
        r1.area();
        System.out.println("É um quadrado perfeito: "+ r1.isQuadrado());

        System.out.println("\nInfo de r2");
        r2.setAltura(5.0);
        r2.setLargura(5.0);
        r2.area();
        System.out.println("É um quadrado perfeito: "+ r2.isQuadrado());
    }
}
