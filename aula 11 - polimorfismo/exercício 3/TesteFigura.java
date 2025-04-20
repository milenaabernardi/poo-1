public class TesteFigura {
    public static void main(String[] args){
        Figura[] figuras = {
                new Quadrado(4),
                new Circulo(3)
        };

        for (Figura f : figuras){
            System.out.println("Área: " + f.calcularArea());
        }
    }
}