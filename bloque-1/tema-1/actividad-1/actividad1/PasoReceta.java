package actividad1;

import java.util.List;
public class PasoReceta {

    private String descripcion;
    private Recipiente recipiente;
    private List<Ingrediente> ingredientes;
    private int duracion;


    public PasoReceta(String descripcion, Recipiente recipiente, List<Ingrediente> ingredientes, int duracion) {
        this.descripcion = descripcion;
        this.recipiente = recipiente;
        this.ingredientes = ingredientes;
        this.duracion = duracion;
    }

    // getters
    public String getDescripcion() {return descripcion;}
    public Recipiente getRecipiente() {return recipiente;}
    public List<Ingrediente> getIngredientes() {return ingredientes;}
    public int getDuracion() {return duracion;}

    @Override
    public String toString() {
        return descripcion + " |" + recipiente.getNombre() + ", " + duracion + " s|";
    }


}