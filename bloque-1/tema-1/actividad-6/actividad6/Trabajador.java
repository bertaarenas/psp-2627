package actividad6;
import java.io.IOException;
import java.nio.file.Files;
public class Trabajador {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("=== TRABAJADOR (proceso " + ProcessHandle.current().pid() + ") ===");

        Files.deleteIfExists(Canal.ARCHIVO);

        System.out.println("Trabajador: esperando órdenes..");

        boolean seguir = true;

        while (seguir) {

            Mensaje mensaje = Canal.recibir();

            if (mensaje == null) {

                Thread.sleep(Canal.PAUSA_MS);

            }
            else if (mensaje.esFin()) {
                System.out.println("Trabajador: recibo FIN, cierro.");
                seguir = false;

            }
            else if (mensaje.esEjecuta()) {
                int tarea = mensaje.tarea;
                System.out.println("Trabajador: recibida la tarea " + tarea + ", estoy trabajando..");

                Canal.enviar(Mensaje.trabajando(tarea));

                Thread.sleep(Canal.ANTES_DE_CONTESTAR_MS);

                long resultado = tarea * 3;

                Canal.enviar(Mensaje.completa(tarea, resultado));
                System.out.println("Trabajador: tarea " + tarea + " completa, resultado = " + resultado);

            }
            else {
                Thread.sleep(Canal.PAUSA_MS);
            }
        }
    }
}