public class TestaContasBancarias {
    public static void main(String[] args) {

        ContaSimples contaSimples = new ContaSimples();
        contaSimples.deposita(1000.00);
        contaSimples.retira(300.00);
        contaSimples.retira(800.00);

        System.out.println("-------------------------------");

        ContaEspecial contaEspecial = new ContaEspecial(5000.00);
        contaEspecial.deposita(1000.00);
        contaEspecial.retira(5500.00); 
        contaEspecial.retira(6000.00);
}
