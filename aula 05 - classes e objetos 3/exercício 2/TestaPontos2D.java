public class TestaPontos2D {
    public static void main(String[] args) {
        Pontos2D p1 = new Pontos2D();
        System.out.println("Coordenadas p1: ("+ p1.getX() + " , " + p1.getY() + ")" );
        System.out.println("Contador: " + Pontos2D.getCont());
        Pontos2D p2 = new Pontos2D(4.65, 5.78);
        System.out.println("Coordenadas p2: ("+ p2.getX() + " , " + p2.getY() + ")" );
        System.out.println("Contador: " + Pontos2D.getCont());
    }
}