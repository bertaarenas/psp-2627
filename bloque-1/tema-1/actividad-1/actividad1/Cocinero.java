package actividad1;

import java.time.LocalTime;

public class Cocinero {

    private String nombre;

    public Cocinero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {return nombre;}


    public void ejecutarPaso (PasoReceta paso){

        Recipiente recipiente = paso.getRecipiente();

        recipiente.setEstado("usando...");
        for (Ingrediente ingrediente : paso.getIngredientes()) {
            recipiente.anadirIngrediente(ingrediente);
        }

        System.out.println("[" + LocalTime.now().withNano(0) + "] " + nombre + " empieza: " + paso.getDescripcion());
        System.out.println(" Recipiente: " + recipiente.getNombre());
        System.out.println(" Ingredientes: " + recipiente.getIngredientes());


        recipiente.setEstado("-- TERMINADO --");
        System.out.println(LocalTime.now());
    }





}
