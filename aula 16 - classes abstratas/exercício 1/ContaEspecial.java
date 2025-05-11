public class ContaEspecial extends ContaBancaria {
    private double limiteAdicional;

    public ContaEspecial(double limiteAdicional) {
        super();
        this.limiteAdicional = limiteAdicional;
    }

    @Override
    public void retira(double valor) {
        if (valor <= saldo + limiteAdicional) {
            saldo -= valor;
            System.out.println("Retirada de R$" + valor + " realizada. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Valor acima do limite permitido para retirada.");
        }
    }

    public double getLimiteAdicional() {
        return limiteAdicional;
    }
}
