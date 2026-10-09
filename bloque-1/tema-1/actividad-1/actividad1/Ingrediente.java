package actividad1;

public class Ingrediente {

    private String nombre;
    private int cantidad;
    private String unidades;

    public Ingrediente(String nombre, int cantidad, String unidades) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidades = unidades;
    }

    public String getNombre() {return nombre;}
    public int  getCantidad() {return cantidad;}
    public String getUnidades() {return unidades;}
    public void setUnidades(String unidades) {this.unidades = unidades;}

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Cantidad: " + cantidad + " " + unidades;
    }


}
