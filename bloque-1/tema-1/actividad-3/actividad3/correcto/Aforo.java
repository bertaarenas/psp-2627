package actividad3.correcto;
public class Aforo {

    private int entradas = 0;

    public synchronized void entrar () {
        entradas++;
    }

    public int getTotal () {
        return entradas;
    }

}
