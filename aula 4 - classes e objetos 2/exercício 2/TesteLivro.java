public class TesteLivro {
    public static void main(String[] args){
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setTitulo("Jogos Vorazes");
        livro1.setAutor("Suzanne Collins");
        livro1.exibirDados();

        livro2.setTitulo("Noite na Taverna");
        livro2.setAutor("Álvares de Azevedo");
        livro2.exibirDados();
    }
}
