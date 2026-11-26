package ejercicio4;
public class Operario implements Runnable{

    private Semaforo semaforo;
    private boolean usarNotifyAll;

    @Override
    public void run () {
        try {
            Thread.sleep(200);
            if(usarNotifyAll) {
                semaforo.ponerVerdeConNotifyAll();
            }
            else {
                semaforo.ponerVerdeConNotify();
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
