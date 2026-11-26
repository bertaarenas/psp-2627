package ejercicio5;
public class Paralelo {
    public static void main(String[] args) {

        int[][] resultados = new int[6][100];
        Thread[] hilos = new Thread[6];

        for (int i = 0; i < 6; i++) {

            final int hilo = i;

            hilos[i] = new Thread(() -> {

                for (int j = 0; j < 100; j++) {

                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    resultados[hilo][j] = 1;
                }

            });

            hilos[i].start();
        }

        // Esperar a que terminen los 6 hilos
        for (int i = 0; i < 6; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Sumar los resultados
        int total = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 100; j++) {
                total += resultados[i][j];
            }
        }

        System.out.println("Total: " + total);
    }
}
