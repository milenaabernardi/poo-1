import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("banana", "uva", "laranja", "abacaxi", "manga", "cereja", "figo"));

        System.out.println("Lista original:");
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println("\nApós sort (ordenação alfabética):");
        System.out.println(lista);

        int pos = Collections.binarySearch(lista, "manga");
        System.out.println("\nPosição de 'manga' com binarySearch: " + pos);

        Collections.reverse(lista);
        System.out.println("\nApós reverse (inversão da ordem):");
        System.out.println(lista);

        Collections.replaceAll(lista, "uva", "kiwi");
        System.out.println("\nApós replaceAll (substituir 'uva' por 'kiwi'):");
        System.out.println(lista);
        
        Collections.rotate(lista, 2);
        System.out.println("\nApós rotate (rotacionar 2 posições para a direita):");
        System.out.println(lista);
    }
}
