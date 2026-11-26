package ejercicio4;
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Semaforo s1 = new Semaforo();
        Thread c1 = new Thread(new Coche(s1, "Coche 1"));
        Thread c2 = new Thread(new Coche(s1, "Coche 2"));
        Thread c3 = new Thread(new Coche(s1, "Coche 3"));

        c1.start();
        c2.start();
        c3.start();

        Thread.sleep(500);
        System.out.println("Demo notify: 1 coche arranca; 2 siguen esperando.");

        c1.join();
        c2.join();
        c3.join();

        System.out.println("----------------------------------------");


        Semaforo s2 = new Semaforo();
        Thread d1 = new Thread(new Coche(s2, "Coche 1"));
        Thread d2 = new Thread(new Coche(s2, "Coche 2"));
        Thread d3 = new Thread(new Coche(s2, "Coche 3"));

        d1.start();
        d2.start();
        d3.start();

        d1.join();
        d2.join();
        d3.join();
    }
}