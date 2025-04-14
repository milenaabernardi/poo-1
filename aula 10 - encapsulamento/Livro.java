public class Livro extends Produto{
    private String autor;
    private int paginas;
    public Livro(String nome, double preco, String autor, int paginas) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public boolean ehCaro() {
        return (this.getPreco() > 60) ? true : false;
    }

    public boolean ehExtenso(){
        return (this.paginas > 100) ? true : false;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public void escreva(){
        System.out.println("");
        System.out.println("Nome do Livro: "+ this.getNome());
        System.out.println("Autor do Livro: "+ this.getAutor());
        System.out.println("Páginas: "+ this.getPaginas());
        System.out.println("Eh extenso: "+ this.ehCaro());
        System.out.println("Preço: "+ this.getPreco());
        System.out.println("Eh caro: "+ this.ehCaro());
        System.out.println("");
    }
}