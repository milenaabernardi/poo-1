public class TesteLivroo {
    public static void main(String[] args) {
        Livroo livro1 = new Livroo();
        Livroo livro2 = new Livroo("1984", "George Orwell");

        System.out.println("Livro 1: " + livro1.getTitulo() + " - " + livro1.getAutor());
        System.out.println("Livro 2: " + livro2.getTitulo() + " - " + livro2.getAutor());
        System.out.println("Total de livros criados: " + Livroo.getQuantidadeLivros());
    }
}