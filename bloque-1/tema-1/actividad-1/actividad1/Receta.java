package actividad1;
import java.util.ArrayList;
import java.util.List;
public class Receta {

    private String nombre;
    private List<PasoReceta> pasos;

    public Receta(String nombre) {
        this.nombre = nombre;
        this.pasos = new ArrayList<>();
    }

    public String getNombre() {return nombre;}
    public List<PasoReceta> getPasos() {return pasos;}

    // metodo para añadir el paso
    public void anadirPaso(PasoReceta paso) {
        pasos.add(paso);
    }


    // ejecuta los pasos
    public void ejecutar(Cocinero cocinero) {

        System.out.println(nombre);
        System.out.println();

        long inicio = System.currentTimeMillis();

        for (PasoReceta paso : pasos) {
            cocinero.ejecutarPaso(paso);
        }

        long fin = System.currentTimeMillis();

        double totalSegundos = (fin - inicio) / 1000.0;

        System.out.println("La receta esta terminada.");
        System.out.println("Tiempo total: " + Math.round(totalSegundos) + " segundos");
    }
}
