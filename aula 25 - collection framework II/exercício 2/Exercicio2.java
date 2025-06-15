import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] cores = {"vermelho", "branco", "azul", "verde", "cinza",
                "laranja", "laranja", "cinza", "vermelho"};

        List<String> list = new ArrayList<>(Arrays.asList(cores));
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(cores));
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(cores));

        System.out.println("ArrayList:");
        printCollection(list);

        System.out.println("\nHashSet:");
        printCollection(hashSet);

        System.out.println("\nTreeSet:");
        printCollection(treeSet);

        System.out.println("\nDiferenças:");
        System.out.println("- ArrayList mantém a ordem de inserção e aceita duplicatas.");
        System.out.println("- HashSet remove duplicatas e não mantém ordem.");
        System.out.println("- TreeSet remove duplicatas e ordena os elementos.");
    }

    public static void printCollection(Collection<String> colecao) {
        for (String cor : colecao) {
            System.out.print(cor + " ");
        }
        System.out.println();
    }
}
