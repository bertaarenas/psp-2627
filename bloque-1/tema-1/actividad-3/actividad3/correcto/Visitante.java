package actividad3.correcto;
public class Visitante implements Runnable {

    private Aforo aforo;

    public Visitante (Aforo aforo) {
        this.aforo = aforo;
    }

    @Override
    public void run () {

        for (int i = 1; i <= 1000; i++) {

            aforo.entrar();
        }
    }
}
