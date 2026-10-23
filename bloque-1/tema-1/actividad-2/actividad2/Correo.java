package actividad2;
public class Correo implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 4; i++) {
            System.out.println(Thread.currentThread().getName() + " -> Revisando mensaje " + i + "..");
            pausa(2000);
        }
        System.out.println(Thread.currentThread().getName() + " -> Correo revisado.");
    }

    private static void pausa(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}