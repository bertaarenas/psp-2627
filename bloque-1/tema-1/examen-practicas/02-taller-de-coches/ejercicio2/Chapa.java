package ejercicio2;
public class Chapa implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + ", trabajando la reparación: " +i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
