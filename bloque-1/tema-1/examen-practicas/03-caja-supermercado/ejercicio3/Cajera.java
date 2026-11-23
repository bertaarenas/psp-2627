package ejercicio3;
public class Cajera implements Runnable {

    private Caja caja;

    public Cajera(Caja caja) {
        this.caja = caja;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 2000; i++) {
            caja.cobrar();
        }
    }
}
