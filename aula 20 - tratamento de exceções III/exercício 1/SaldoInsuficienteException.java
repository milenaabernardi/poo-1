public class SaldoInsuficienteException extends Exception {
    private double valor;

    private double saldo;

    public SaldoInsuficienteException(double valor, double saldo) {
        this.valor = valor;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "O seu saldo (R$ " + saldo + ") é insuficiente para a quantia que "
                + "deseja sacar (+ taxa operação): R$ " + valor;
    }
}