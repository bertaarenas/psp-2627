package actividad2;
public class Backup implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(Thread.currentThread().getName() + " -> Haciendo backup del fichero " + i + "..");
            pausa(1000);
        }
        System.out.println(Thread.currentThread().getName() + " -> Backup hecho.");
    }

    private static void pausa(long ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}