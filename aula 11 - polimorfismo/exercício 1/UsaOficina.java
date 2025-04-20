import java.util.Random;

public class UsaOficina {
    public static void main(String[] args) {
        Random gerador = new Random();
        Oficina oficina = new Oficina();

        for (int i = 0; i < 10; i++) {
            Veiculo v;
            if (gerador.nextInt(2) == 0) {
                v = new Automovel();
            } else {
                v = new Bicicleta();
            }
            oficina.consertar(v);
        }
    }
}

