public class TesteCliente {
    public static void main(String[] args) {
        Cliente[] clientes = {
                new Cliente("Milena", 1000, 500),
                new ClienteEspecial("Laura", 2000, 1000)
        };

        for (Cliente c : clientes){
            System.out.println(c.toString());
        }
    }
}