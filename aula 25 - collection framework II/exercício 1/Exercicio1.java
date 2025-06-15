import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Arthur");
        nomes.add("Júlia");
        nomes.add("Laura");
        nomes.add("Leonardo");
        nomes.add("Milena");

        ListIterator<String> iterador = nomes.listIterator(nomes.size());

        System.out.println("Nomes na ordem inversa:");
        while (iterador.hasPrevious()) {
            System.out.println(iterador.previous());
        }
    }
}
