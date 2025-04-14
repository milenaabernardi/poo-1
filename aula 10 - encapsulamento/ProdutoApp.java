public class ProdutoApp {
    public static void main(String[] args) {
        Produto p1 = new Produto("Marca-páginas", 3);
        Produto p2 = new Produto("Caneca", 25);

        Livro l1 = new Livro("Amanhecer na Colheita", 79.9, "Suzanne Collins", 448);
        Livro l2 = new Livro("A Biblioteca da Meia-Noite", 49.9, "Matt Haig", 308);

        System.out.println("PRODUTOS -----------------------");
        p1.escreva();
        p2.escreva();
        System.out.println("\nLIVROS-----------------------");
        l1.escreva();
        l2.escreva();
    }
}
