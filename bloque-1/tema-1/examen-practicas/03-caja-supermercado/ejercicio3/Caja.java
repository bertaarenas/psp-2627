package ejercicio3;
public class Caja {

    private int articulos = 0;

    public synchronized void cobrar(){
        articulos ++;
    }

    public int getTotal(){
        return articulos;
    }
}
