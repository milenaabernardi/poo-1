public class TwoDShape {
    private double altura, largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    public void mostraDim(){
        System.out.println("Largura e Altura = "+ altura + " e " + largura);
    }

}