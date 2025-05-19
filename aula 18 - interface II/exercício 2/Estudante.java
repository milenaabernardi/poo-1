public class Estudante implements Falante {
    private String nome;
    private int idade;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void falar() {
        System.out.println("Oii, eu sou estudante de Ciência da Computação!");
    }

    public String seuIdioma() {
        return "Português";
    }

    public void identificarSe() {
        System.out.println("Eu sou estudante: " + nome);
    }
}
