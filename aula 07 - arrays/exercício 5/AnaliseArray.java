import java.util.Scanner;

public class AnaliseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = { 12, 11, 9, 5, 2, 1 };

        System.out.print("Digite um número inteiro positivo (x): ");
        int x = scanner.nextInt();

        int maiorDiferenca = 0;
        int pos1 = 0, pos2 = 1;

        for (int i = 0; i < vet.length - 1; i++) {
            int diferenca = Math.abs(vet[i] - vet[i + 1]);
            if (diferenca > maiorDiferenca) {
                maiorDiferenca = diferenca;
                pos1 = i;
                pos2 = i + 1;
            }
        }

        System.out.println("Maior diferença: " + maiorDiferenca +
                " entre vet[" + pos1 + "] = " + vet[pos1] +
                " e vet[" + pos2 + "] = " + vet[pos2]);

        int maiores = 0, menores = 0, iguais = 0;

        for (int num : vet) {
            if (num > x) {
                maiores++;
            } else if (num < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("Números maiores que x: " + maiores);
        System.out.println("Números menores que x: " + menores);
        System.out.println("Números iguais a x: " + iguais);

        scanner.close();
    }
}

