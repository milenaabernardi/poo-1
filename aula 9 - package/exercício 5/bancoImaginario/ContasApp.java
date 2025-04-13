package bancoImaginario;

public class ContasApp {
    public static void main(String[] args){
        ContaCorrente contas[] = new ContaCorrente[3];
        contas[0] = new ContaCorrente(1000);
        contas[1] = new ContaCorrenteEspecial(2000);
        contas[2] = new ContaCorrenteEspecial(5000);

        for (ContaCorrente c : contas) {
            c.depositar(1000);
            c.sacar(200);
            System.out.println("Saldo da Conta apos depositar R$ 1.000 e sacar R$ 200 : R$ " + c.getSaldo());
            System.out.println("");
        }
    }
}
