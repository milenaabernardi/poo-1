public class TesteLivro {
    public static void main(String[] args){
        Livro2 livro1 = new Livro2();
        Livro2 livro2 = new Livro2();

        livro1.setTitulo("Jogos Vorazes");
        livro1.setAutor("Suzanne Collins");
        livro1.exibirDados();

        livro2.setTitulo("Noite na Taverna");
        livro2.setAutor("Álvares de Azevedo");
        livro2.exibirDados();
    }
}
