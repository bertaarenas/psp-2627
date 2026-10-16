package actividad2;
public class Impresora extends Thread {

    public Impresora(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " -> Imprimiendo página " + i + "..");

            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                System.out.println(getName() + " -> Ha habido un error al imprimir página.");
            }
        }

        System.out.println(getName() + " -> Se han acabado de imprimir todas las páginas.");
    }
}