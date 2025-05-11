public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public abstract void retira(double valor);

    public double getSaldo() {
        return saldo;
    }
}
