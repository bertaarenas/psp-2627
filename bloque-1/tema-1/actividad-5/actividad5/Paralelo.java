package actividad5;
public class Paralelo {
    public static void main(String[] args) {

        System.out.println("-- 8 hilos --");

        int numhilos = 8;
        int pedidosHilo = Almacen.TOTAL_PEDIDOS / numhilos;

        Tramo[] tramos = new Tramo[numhilos];
        Thread[] hilos = new Thread[numhilos];

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < numhilos; i++) {
            int primerPedido = i * pedidosHilo + 1;
            int ultimoPedido = (i + 1) * pedidosHilo;

            tramos[i] = new Tramo(primerPedido, ultimoPedido);
            hilos[i] = new Thread(tramos[i], "Hilo-" + (i + 1));
        }

        for (int i = 0; i < numhilos; i++) {
            hilos[i].start();
        }

        try {
            for (int i = 0; i < numhilos; i++) {
                hilos[i].join();
            }
        }
        catch (InterruptedException e) {
            System.out.println("El main ha sido interrumpido mientras esperaba.");
        }

        int[] resultados = new int[Almacen.TOTAL_PEDIDOS];
        for (int i = 0; i < numhilos; i++) {
            int[] parcial = tramos[i].getResultados();
            for (int j = 0; j < parcial.length; j++) {
                resultados[i * pedidosHilo + j] = parcial[j];
            }
        }

        int total = 0;
        for (int i = 0; i < resultados.length; i++) {
            total = total + resultados[i];
        }

        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;

        System.out.println("Total pedidos preparados: " + total);
        System.out.println("Tiempo: " + tiempo);
    }
}