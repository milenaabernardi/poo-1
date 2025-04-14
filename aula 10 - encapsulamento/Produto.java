public class Produto{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome= nome;
        this.preco = preco;
    }
    public boolean ehCaro(){
        return (this.preco > 50.0) ? true : false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void escreva(){
        System.out.println("");
        System.out.println("Nome do Produto: "+ this.getNome());
        System.out.println("Preço: "+ this.getPreco());
        System.out.println("Eh caro: "+ this.ehCaro());
        System.out.println("");
    }
}
