package actividad4;
public class Recreo {

    private boolean sonando = false;
    private int despertados;

    public synchronized int getDespertados() {
        return despertados;
    }

    public synchronized void esperarTimbre (String alumno) {

        System.out.println(alumno + " espera el timbre.. ");

        while (!sonando) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(alumno + " ha sido interrumpido.");
            }

            despertados++;
            System.out.println(alumno + " ha escuchado el timbre, sale al recreo.");
        }
    }


    // solo un alumno
    public synchronized void tocarConNotify() {
        sonando = true;
        System.out.println("El portero toca el timbre (notify)");
        notify();
    }

    // todos los alumnos
    public synchronized void tocarConNotifyAll() {
        sonando = true;
        System.out.println("El portero toca el timbre (NotifyAll)");
        notifyAll();
    }
}
