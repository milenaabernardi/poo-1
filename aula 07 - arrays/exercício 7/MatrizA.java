public class MatrizA {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int valor = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = valor;
                valor++;
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
