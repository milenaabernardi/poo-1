public class Exercicio3 {
    public static void main(String[] args){
        verificaPalavra("Programar");
        verificaPalavra("Teste");
    }

    public static void verificaPalavra(String palavra){
        if (palavra.length() < 8) {
            System.out.println("Erro: a palavra deve ter no mínimo 8 caracteres.");
        } else {
            String novaPalavra = palavra.substring(0, 2) + palavra.substring(palavra.length() - 2);
            System.out.println("Nova palavra formada: " + novaPalavra);
        }
    }
}