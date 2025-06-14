public class Exercicio2App {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        try {
            conta.depositar(100);
            conta.depositar(-50);
        } catch (ValorNegativoException e) {
            System.out.println("Exceção encontrada: " + e);
        }

        try {
            conta.sacar(70);
            conta.sacar(50);
        } catch (ValorNegativoException | SaldoInsuficienteException e) {
            System.out.println("Exceção encontrada: " + e);
        }

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}