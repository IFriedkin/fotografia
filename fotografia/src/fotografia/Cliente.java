package fotografia;

/**
 * Clase Cliente.
 * @author Ibrahim González
 */
public class Cliente {
    /**
     * Nif del cliente.
     */
    private Dni nif;
    
    /**
     * Nombre del cliente.
     */
    private String nombre;
    
    /**
     * Dirección del cliente.
     */
    private String direccion;
    
    /**
     * Número de telefono del cliente.
     */
    private String numTelefono;
    
    /**
     * Email del cliente.
     */
    private String email;

    /**
     * Constructor parametrizado de la clase Clientes.
     * @param nif Dni | Nif del cliente.
     * @param nombre String | Nombre del cliente.
     * @param direccion String | Dirección del cliente.
     * @param numTelefono String | Número de telefono del cliente.
     * @param email String | Email del cliente.
     */
    public Cliente(Dni nif, String nombre, String direccion, String numTelefono, 
            String email) {
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.email = email;
    }

    //Getters
    public Dni getNif() {return nif;}
    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}
    public String getNumTelefono() {return numTelefono;}
    public String getEmail() {return email;}
    
    //Setters
    public void setNif(Dni nif) {this.nif = nif;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;}
    public void setEmail(String email) {this.email = email;}

    /**
     * Muestra la infrmación de un cliente de forma ordenada.
     * @return 
     */
    @Override
    public String toString() {
        return "Cliente:\n" + "NIF: " + nif + "\n Nombre: " + nombre + 
                "\n Dirección: " + direccion + "\n Número de teléfono=" + 
                numTelefono + "\n Email=" + email + '\n';
    } 
}
