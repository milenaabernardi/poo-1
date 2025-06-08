public class ClassB<T> implements IGenIF<T> {
    @Override
    public void exibir(T obj) {
        System.out.println("Valor: " + obj);
    }
}
