package actividad1;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Cocinero berta = new Cocinero("Berta");
        Receta receta = new Receta("Espaguetis a la boloñesa (2 pers)");
        Recipiente olla = new Recipiente("Olla");
        Recipiente sarten = new Recipiente("Sarten");
        Recipiente plato = new Recipiente("Plato");

        // paso 1
        List<Ingrediente> ingredientes1 = new ArrayList<>();
        ingredientes1.add(new Ingrediente("Agua", 2000, "ml"));
        ingredientes1.add(new Ingrediente("Sal", 10, "g"));
        ingredientes1.add(new Ingrediente("Aceite", 20, "ml"));
        receta.anadirPaso(new PasoReceta("Hervir el agua, echarle la sal y el aceite.", olla, ingredientes1, 2));

        // paso 2
        List<Ingrediente> ingredientes2 = new ArrayList<>();
        ingredientes2.add(new Ingrediente("Espaguetis", 200, "g"));
        receta.anadirPaso(new PasoReceta("Meter los espaguetis y dejarlos cocer", olla, ingredientes2, 7));

        // paso 3
        List<Ingrediente> ingredientes3 = new ArrayList<>();
        ingredientes3.add(new Ingrediente("Cebolla", 50, "g"));
        ingredientes3.add(new Ingrediente("Ajo", 1, "dientes"));
        receta.anadirPaso(new PasoReceta("Sofreír la cebolla y el ajo", sarten, ingredientes3, 5));

        // paso 4
        List<Ingrediente> ingredientes4 = new ArrayList<>();
        ingredientes4.add(new Ingrediente("Carne picada", 300, "g"));
        receta.anadirPaso(new PasoReceta("Añadir la carne picada.", sarten, ingredientes4, 4));

        // paso 5
        List<Ingrediente> ingredientes5 = new ArrayList<>();
        ingredientes5.add(new Ingrediente("Tomate frito", 250, "g"));
        receta.anadirPaso(new PasoReceta("Añadir el tomate a la carne y mezclarlo.", sarten, ingredientes5, 3));

        // paso 6
        List<Ingrediente> ingredientes6 = new ArrayList<>();
        receta.anadirPaso(new PasoReceta("Escurrir la pasta", olla, ingredientes6, 1));

        // paso 7
        List<Ingrediente> ingredientes7 = new ArrayList<>();
        ingredientes7.add(new Ingrediente("Espaguetis", 200, "g"));
        receta.anadirPaso(new PasoReceta("Meter los espaguetis en la sarten con la salsa boloñesa, y mezclar.", sarten, ingredientes7, 2));

        // paso 9
        List<Ingrediente> ingredientes8 = new ArrayList<>();
        ingredientes8.add(new Ingrediente("Espaguetis a la boloñesa", 2, "platos"));
        receta.anadirPaso(new PasoReceta("Emplatar", plato, ingredientes8, 1));

        receta.ejecutar(berta);
    }
}