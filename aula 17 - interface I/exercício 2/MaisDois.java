public class MaisDois implements Series {
    private int inicio;
    private int valor;

    public MaisDois() {
        inicio = 0;
        valor = 0;
    }

    @Override
    public int getNext() {
        valor += 2;
        return valor;
    }

    @Override
    public void reset() {
        valor = inicio;
    }

    @Override
    public void setStart(int x) {
        inicio = x;
        valor = x;
    }
}
