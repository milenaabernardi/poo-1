public class TesteDoisGen {
    public static void main(String[] args) {
        DoisGen<String, Integer> obj = new DoisGen<>("Teste", 88);

        obj.mostrarTipos();
        System.out.println("Valor T: " + obj.getOb1());
        System.out.println("Valor V: " + obj.getOb2());
    }
}
