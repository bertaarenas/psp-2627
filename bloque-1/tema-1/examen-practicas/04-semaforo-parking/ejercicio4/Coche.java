package ejercicio4;
public class Coche implements Runnable {

    private Semaforo semaforo;
    private String nombre;

    public Coche (Semaforo semaforo, String nombre) {
        this.semaforo = semaforo;
        this.nombre = nombre;
    }
    @Override
    public void run() {
        semaforo.esperarVerde(nombre);
    }
}
