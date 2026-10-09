package actividad1;

import java.util.ArrayList;
import java.util.List;

public class Recipiente {

    private String nombre;
    private String estado;
    private List<Ingrediente> ingredientes;


    public Recipiente(String nombre) {
        this.nombre = nombre;
        this.estado = "Vacia";
        this.ingredientes = new ArrayList<>();
    }

    // getters
    public String getNombre() {return nombre;}
    public String getEstado() {return estado;}
    public List<Ingrediente> getIngredientes() {return ingredientes;}

    // metodo para llenar

    public void anadirIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    // metodo para vaciar

    public void vaciarRecipiente(){
        ingredientes.clear();
    }

    // metodo para inidcar si esta vacio, en uso o acabado

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString()
    {
        return nombre + " esta: " + estado;
    }
}
