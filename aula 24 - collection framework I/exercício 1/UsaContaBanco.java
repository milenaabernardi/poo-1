import java.util.ArrayList;

public class UsaContaBanco {
    public static void main(String[] args) {
        ArrayList<ContaBanco> contas = new ArrayList<ContaBanco>();

        contas.add(new ContaBanco(1, 10000.0));
        contas.add(new ContaBanco(2, 5000.0));
        contas.add(new ContaBanco(3)); 
        contas.add(new ContaBanco(4, 2500.0));

        System.out.println("Total de contas adicionadas: " + contas.size());

        System.out.println("\nContas cadastradas:");
        for (ContaBanco c : contas) {
            System.out.println(c);
        }

        contas.get(0).saque(1000.0);
        contas.get(1).deposito(1500.0);
        contas.get(2).deposito(300.0);

        System.out.println("\nApós depósitos e saques:");
        for (ContaBanco c : contas) {
            System.out.println(c);
        }

        contas.remove(0);

        System.out.println("\nTotal após remoção da primeira conta: " + contas.size());

        System.out.println("\nContas restantes:");
        for (ContaBanco c : contas) {
            System.out.println(c);
        }
    }
}
