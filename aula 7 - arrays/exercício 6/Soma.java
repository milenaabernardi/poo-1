public class Soma {

    public static int soma(int... numeros) {
        int total = 0;
        for (int num : numeros) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int resultado1 = soma(10, 20, 30);
        System.out.println("Resultado da primeira soma: " + resultado1);

        int resultado2 = soma(5, 15, 25, 35, 45);
        System.out.println("Resultado da segunda soma: " + resultado2);
    }
}
