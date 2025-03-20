public class Teste {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();
        universidade.nome = "UNICENTRO";
        universidade.cidade = "Guarapuava";
        universidade.estado = "Paraná";
        universidade.exibirDados();

        Aluno aluno = new Aluno();
        aluno.nome = "Milena Bernardi";
        aluno.curso = "Ciência da Computação";
        aluno.exibirDados();
    }
}
