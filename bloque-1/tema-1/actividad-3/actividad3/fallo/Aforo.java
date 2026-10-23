package actividad3.fallo;
public class Aforo {

    private int entradas = 0;

    public void entrar () {
        entradas++;
    }

    public int getTotal () {
        return entradas;
    }

}
