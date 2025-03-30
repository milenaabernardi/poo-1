public class Pontos2D {
    private double x;
    private double y;
    private static int cont=0;
    public Pontos2D() {
        this.x = 0.0;
        this.y = 0.0;
        cont++;
    }
    public Pontos2D(double x, double y) {
        this.x = x;
        this.y = y;
        cont++;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public static int getCont() {
        return cont;
    }
}