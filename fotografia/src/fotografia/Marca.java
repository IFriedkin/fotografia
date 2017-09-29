package fotografia;

/**
 * Clase Marca.
 * @author Ibrahim González
 */
public class Marca {
    /**
     * Nombre de la marca.
     */
    private String nombre;
    /**
     * Dirección del servicio técnico.
     */
    private String dirReparacion;

    /**
     * Constructor parametrizado de la clase Marca.
     * @param nombre
     * @param dirReparacion 
     */
    public Marca(String nombre, String dirReparacion) {
        this.nombre = nombre;
        this.dirReparacion = dirReparacion;
    }

    //Getters
    public String getNombre() {return nombre;}
    public String getDirReparacion() {return dirReparacion;}

    //Setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDirReparacion(String dirReparacion) {
        this.dirReparacion = dirReparacion;}
}
