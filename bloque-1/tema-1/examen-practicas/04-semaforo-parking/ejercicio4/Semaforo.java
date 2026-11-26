package ejercicio4;
public class Semaforo {

    private boolean verde = false;

    public synchronized void esperarVerde(String coche) {

        while (!verde) {
            while (!verde) {
                try {
                    wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Arranca.");
        }
    }

    public synchronized void ponerVerdeConNotify() {
        verde = true;
        System.out.println("Semáforo en verde, arranca 1.");
    }

    public synchronized void ponerVerdeConNotifyAll() {
        verde = true;
        System.out.println("Semáforo en verde, arrancan todos.");
    }
}
