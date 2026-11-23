package ejercicio2;
public class Mecanico extends Thread {

    public Mecanico (String nombre) {
        super(nombre);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(getName()+ ", intervención: " +i);

            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
