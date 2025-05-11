public class TestaSeries {
    public static void main(String[] args) {
        Series serie = new MaisDois();

        System.out.println("Série MaisDois:");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie.reset();
        System.out.println("\nApós reset():");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie.setStart(100);
        System.out.println("\nApós setStart(100):");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        System.out.println("\nRepetição dos primeiros 5 valores:");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie = new MaisTres();
        System.out.println("\nSérie MaisTres:");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie.reset();
        System.out.println("\nApós reset():");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie.setStart(100);
        System.out.println("\nApós setStart(100):");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }
    }
}
