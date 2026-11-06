package actividad5;
public class Tramo implements Runnable {

    private int primerPedido;
    private int ultimoPedido;
    private int[] resultados;

    public Tramo(int primerPedido, int ultimoPedido) {
        this.primerPedido = primerPedido;
        this.ultimoPedido = ultimoPedido;
        this.resultados = new int[ultimoPedido - primerPedido + 1];
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " | Empieza los pedidos " + primerPedido + " a " + ultimoPedido);

        for (int pedido = primerPedido; pedido <= ultimoPedido; pedido++) {
            resultados[pedido - primerPedido] = Almacen.prepararPedido(pedido);
        }

        System.out.println(Thread.currentThread().getName() + " | Terminó los pedidos " + primerPedido + " a " + ultimoPedido);
    }

    // para el main
    public int[] getResultados() {
        return resultados;
    }
}