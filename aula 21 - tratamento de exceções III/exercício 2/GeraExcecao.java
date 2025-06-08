public class GeraExcecao {
    public static void geraException() {
        int[] nums = new int[4];
        System.out.println("Antes da exceção ser gerada.");
        nums[7] = 10;
        System.out.println("Isto não será exibido!");
    }
}