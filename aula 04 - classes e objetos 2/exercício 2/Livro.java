public class Livro {
    private String titulo, autor;

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setTitulo(String titulo1){
        titulo = titulo1;
    }
    public void setAutor(String autor1){
        autor = autor1;
    }

    public void exibirDados(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println();
    }
}
