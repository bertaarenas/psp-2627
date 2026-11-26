package ejercicio5;
public class Secuencial {
    public static void main(String[] args)  {

        int total = 0;

        for (int i = 0; i < 600; i++) {

            try {
                Thread.sleep(20);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            total++;
        }

        System.out.println("Total: " + total);

    }
}
