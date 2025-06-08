public class Exercicio2 {
    public static void main(String[] args) {
        try {
            GeraExcecao.geraException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("\nMensagem padrão é: ");
            System.out.println(exc);
            StackTraceElement[] traceElements = exc.getStackTrace();
            System.out.println("\nRastreamento da pilha obtido de exception.getStackTrace():");
            System.out.println("Classe\t\tArquivo\t\t\tLinha\tMetodo");
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());
            }
        }
    }
}