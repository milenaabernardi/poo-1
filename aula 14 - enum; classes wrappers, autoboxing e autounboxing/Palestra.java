public class Palestra {
    public static void main(String[] args){
        Luz luz;

        luz = Luz.VERDE;

        switch (luz) {
            case VERMELHO:
                System.out.println("palestra indisponível");
                break;
            case AMBAR:
                System.out.println("palestra sendo liberada");
                break;
            case VERDE:
                System.out.println("palestra disponível");
                break;
        }


    }
}