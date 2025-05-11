public class ContaSimples extends ContaBancaria {

    public ContaSimples() {
        super();
    }

    @Override
    public void retira(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Retirada de R$" + valor + " realizada. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirada de R$" + valor);
        }
    }
}
