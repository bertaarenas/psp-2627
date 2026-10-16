package actividad2;
public class Main {
    public static void main(String[] args) {

        Impresora impresora = new Impresora("Impresora");
        Thread correo = new Thread(new Correo(), "Correo");
        Thread backup = new Thread(new Backup(), "Backup");

        impresora.start();
        correo.start();
        backup.start();


        try {
            impresora.join();
            correo.join();
            backup.join();
        } catch (InterruptedException e) {
            System.out.println("Main fue interrumpido mientras esperaba");
        }

        System.out.println("-- TERMINADO --");

    }
}
