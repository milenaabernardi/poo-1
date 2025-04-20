public class Exercicio2 {

    public static void main(String[] args){
        String palavra1 = "Sol";
        String palavra2 = "sol";

        System.out.println("Palavra 1: " + palavra1);
        System.out.println("Palavra 2: " + palavra2);

        comparar(palavra1, palavra2);
    }

    public static void comparar(String s1, String s2){
        System.out.println("Resultado com equals: " + s1.equals(s2));
        System.out.println("Resultado com equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));
    }
}