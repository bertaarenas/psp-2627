package ejercicio2;
public class Pintura implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 5; i++){

            System.out.println(Thread.currentThread().getName() + ", dando la capa: " + i);

            try {
                Thread.sleep(300);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
