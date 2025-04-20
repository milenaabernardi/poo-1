public class Cliente {
    protected String nome;
    protected double saldo;
    protected double limite;

    public Cliente(String nome, double saldo, double limite){
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    @Override
    public String toString(){
        return "Cliente: " + nome + ", Saldo: " + saldo + ", Limite: " + limite;
    }
}