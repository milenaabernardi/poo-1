public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo() {
        this.comprimento = 1.0;
        this.largura = 1.0;
    }

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Erro: O comprimento deve ser maior que zero.");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: A largura deve ser maior que zero.");
        }
    }

    public double calculaPerimetro() {
        return 2 * (this.comprimento + this.largura);
    }

    public double calculaArea() {
        return this.comprimento * this.largura;
    }

    public void imprimeDados() {
        System.out.println("Retângulo com comprimento " + this.comprimento + " e largura " + this.largura);
        System.out.println("Perímetro: " + this.calculaPerimetro());
        System.out.println("Área: " + this.calculaArea());
        System.out.println("É quadrado? " + (this.isQuadrado() ? "Sim" : "Não"));
    }

    public boolean isQuadrado() {
        return this.comprimento == this.largura;
    }
}