public class Exercicio4 {
    public static void main(String[] args){
        System.out.println(processa("Milena"));
        System.out.println(processa(null));
    }

    public static String processa(String s) {
        if (s == null) {
            return null;
        } else {
            return s.toUpperCase();
        }
    }
}
