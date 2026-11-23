package ejercicio3;
public class Main  {
    public static void main(String[] args) throws InterruptedException {

        Caja caja = new Caja();

        Thread c1 = new Thread(new Cajera(caja), "Cajera 1");
        Thread c2 = new Thread(new Cajera(caja), "Cajera 2");
        Thread c3 = new Thread(new Cajera(caja), "Cajera 3");
        Thread c4 = new Thread(new Cajera(caja), "Cajera 4");

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Total esperado: 8000.");
        System.out.println("Total: " + caja.getTotal());
    }
}
