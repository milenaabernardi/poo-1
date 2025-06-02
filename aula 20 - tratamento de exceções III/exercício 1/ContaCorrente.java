public class ContaCorrente {
    private double saldo;

    protected double getTaxaOperacao() {
        return 0.05;
    }

    public void depositar(double quantia) throws ValorNegativoException {
        if (quantia < 0) throw new ValorNegativoException(quantia);
        saldo += quantia;
    }

    public void sacar(double quantia) throws ValorNegativoException, SaldoInsuficienteException {
        if (quantia < 0) throw new ValorNegativoException(quantia);
        quantia += getTaxaOperacao() * quantia;
        if (quantia > saldo) throw new SaldoInsuficienteException(quantia, saldo);
        saldo -= quantia;
    }

    public double getSaldo() {
        return saldo;
    }
}