package actividad4;
import actividad4.Recreo;
public class Alumno implements Runnable {

    private Recreo recreo;
    private String nombre;

    public Alumno(Recreo recreo, String nombre) {
        this.recreo = recreo;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        recreo.esperarTimbre(nombre);
    }
}