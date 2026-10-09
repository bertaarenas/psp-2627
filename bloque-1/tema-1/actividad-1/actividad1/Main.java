package actividad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cocinero berta = new Cocinero("Berta");

        Recipiente sarten = new Recipiente("Sartén grande");

        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Cebolla", 200, "g"));
        ingredientes.add(new Ingrediente("Aceite", 30, "ml"));

        PasoReceta paso = new PasoReceta("Sofreír la cebolla", sarten, ingredientes, 3);

        berta.ejecutarPaso(paso);

        System.out.println(sarten);
    }
}
