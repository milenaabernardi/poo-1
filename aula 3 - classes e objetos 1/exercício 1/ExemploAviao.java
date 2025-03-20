public class ExemploAviao {
    public static void main(String[] args){
        Aviao aviao1 = new Aviao();
        aviao1.fabricante = "Boeing";
        aviao1.modelo = "777";
        aviao1.quantidadeAssentos = 200;
        aviao1.ligar();

        Aviao aviao2 = new Aviao();
        aviao2.fabricante = "Boeing";
        aviao2.modelo = "707";
        aviao2.quantidadeAssentos = 300;
        aviao2.ligar();
    }
}
