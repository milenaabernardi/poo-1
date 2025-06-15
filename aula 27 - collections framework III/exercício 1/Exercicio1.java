import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        TreeMap<String, Double> estudantes = new TreeMap<>();

        estudantes.put("Arthur", 8.5);
        estudantes.put("Júlia", 9.0);
        estudantes.put("Laura", 9.2);
        estudantes.put("Leonardo", 6.8);
        estudantes.put("Milena", 8.0);

        System.out.println("Estudantes e notas (inicial):");
        for (Map.Entry<String, Double> entry : estudantes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        estudantes.put("Arthur", 9.5);

        System.out.println("\nApós inserir par com chave já existente (Arthur -> 9.5):");
        for (Map.Entry<String, Double> entry : estudantes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
