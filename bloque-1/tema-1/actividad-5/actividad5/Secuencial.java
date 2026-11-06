package actividad5;
public class Secuencial {
    public static void main(String[] args) {

        System.out.println("-- SECUENCIAL: solo el hilo main --");

        int[] resultados = new int[Almacen.TOTAL_PEDIDOS];

        long inicio = System.currentTimeMillis();

        for (int pedido = 1; pedido <= Almacen.TOTAL_PEDIDOS; pedido++) {
            resultados[pedido - 1] = Almacen.prepararPedido(pedido);
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