package bancoImaginario;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double qnt){
        this.saldo -= qnt+(qnt*0.02);
    }
    public void depositar(double qnt){
        saldo+=qnt;
    }
    public double taxa(double qnt){
        return qnt*0.02;
    }
}
