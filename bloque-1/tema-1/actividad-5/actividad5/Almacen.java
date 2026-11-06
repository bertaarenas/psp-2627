package actividad5;
public class Almacen {

    public static final int TOTAL_PEDIDOS = 800;
    public static final int MS_POR_PEDIDO = 25;

    public static int prepararPedido(int numeroPedido) {

        try {
            Thread.sleep(MS_POR_PEDIDO);
        }
        catch (InterruptedException e) {
            System.out.println("Pedido " + numeroPedido + " interrumpido.");
        }
        return 1;
    }

}
