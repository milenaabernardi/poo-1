import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        String[] cores1 = { "preto", "amarelo", "verde", "azul", "branco" };
        List<String> list1 = new LinkedList<>(Arrays.asList(cores1));
        printList(list1);

        String[] cores2 = { "dourado", "prata", "marron", "cinza" };
        List<String> list2 = new LinkedList<>(Arrays.asList(cores2));
        printList(list2);

        list1.addAll(list2);
        System.out.println("\nLista concatenada:");
        printList(list1);
    }

    public static void printList(List<String> lista) {
        for (String cor : lista) {
            System.out.print(cor + " ");
        }
        System.out.println();
    }
}
