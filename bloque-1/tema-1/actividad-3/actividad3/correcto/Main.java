package actividad3.correcto;
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Aforo aforo = new Aforo();

        Thread visitante1 = new Thread(new Visitante(aforo), "Visitante1");
        Thread visitante2 = new Thread(new Visitante(aforo), "Visitante2");
        Thread visitante3 = new Thread(new Visitante(aforo), "Visitante3");
        Thread visitante4 = new Thread(new Visitante(aforo), "Visitante4");

        visitante1.start();
        visitante2.start();
        visitante3.start();
        visitante4.start();

        visitante1.join();
        visitante2.join();
        visitante3.join();
        visitante4.join();

        System.out.println("-- AFORO: " + aforo.getTotal() + " --");


    }
}
