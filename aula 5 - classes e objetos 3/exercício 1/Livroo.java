class Livroo {
    private String titulo;
    private String autor;
    private static int quantidadeLivros = 0;

    public Livroo() {
        this.titulo = "Desconhecido";
        this.autor = "Anônimo";
        quantidadeLivros++;
    }

    public Livroo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        quantidadeLivros++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public static int getQuantidadeLivros() {
        return quantidadeLivros;
    }
}