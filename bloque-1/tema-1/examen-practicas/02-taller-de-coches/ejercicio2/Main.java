package ejercicio2;
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Taller abierto.");

        Mecanico mecanico = new Mecanico("Mecanico");

        Thread chapa = new Thread(new Chapa(), "Chapista");
        Thread pintura = new Thread(new Pintura(), "Pintor");

        mecanico.start();
        chapa.start();
        pintura.start();

        mecanico.join();
        chapa.join();
        pintura.join();

        System.out.println("Taller cerrado.");
    }
}
