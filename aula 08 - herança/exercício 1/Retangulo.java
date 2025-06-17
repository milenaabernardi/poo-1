public class Retangulo extends TwoDShape{
    public boolean isQuadrado(){
        if (getAltura() == getLargura()){
            return true;
        }
        else{
            return false;
        }
    }
    public void area(){
        System.out.println("Área = "+ getAltura()*getLargura());
    }
}
