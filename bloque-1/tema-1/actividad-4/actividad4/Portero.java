package actividad4;
public class Portero implements Runnable {

    private Recreo recreo;
    private boolean usarNotifyAll;

    public Portero(Recreo recreo, boolean usarNotifyAll) {
        this.recreo = recreo;
        this.usarNotifyAll = usarNotifyAll;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000); // 1 segundo
        }
        catch (InterruptedException e) {
            System.out.println("Portero ha sido interrumpido");
        }

        if (usarNotifyAll) {
            recreo.tocarConNotifyAll();
        }
        else {
            recreo.tocarConNotify();
        }
    }
}
