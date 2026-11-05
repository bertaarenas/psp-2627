package actividad6;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("-- Main (proceso " + ProcessHandle.current().pid() + ") --");

        int numTareas = 8;

        long[] resultados = new long[numTareas];

        for (int tarea = 1; tarea <= numTareas; tarea++) {

            Canal.enviar(Mensaje.ejecuta(tarea));
            System.out.println("Main: envío la orden de la tarea " + tarea);

            boolean avisado = false;

            while (!avisado) {
                Mensaje mensaje = Canal.recibir();

                if (mensaje != null && mensaje.esTrabajando() && mensaje.tarea == tarea) {
                    System.out.println("Main: el trabajador está trabajando en la tarea " + tarea);
                    avisado = true;
                }
                else {
                    Thread.sleep(Canal.PAUSA_MS);
                }
            }

            boolean respondido = false;

            while (!respondido) {
                Mensaje mensaje = Canal.recibir();

                if (mensaje != null && mensaje.esCompleta() && mensaje.tarea == tarea) {
                    resultados[tarea - 1] = mensaje.resultado;
                    System.out.println("Main: tarea " + tarea + " completa, resultado = " + mensaje.resultado);
                    respondido = true;
                }
                else {
                    Thread.sleep(Canal.PAUSA_MS);
                }
            }

            if (tarea < numTareas) {
                Thread.sleep(Canal.ANTES_DE_CONTESTAR_MS);
            }
        }

        Canal.enviar(Mensaje.fin());
        System.out.println("Main: envío FIN al trabajador");

        System.out.println("-- Resultados --");
        long suma = 0;
        for (int i = 0; i < numTareas; i++) {
            System.out.println("Tarea " + (i + 1) + " -> " + resultados[i]);
            suma = suma + resultados[i];
        }
        System.out.println("Suma total: " + suma);
    }
}