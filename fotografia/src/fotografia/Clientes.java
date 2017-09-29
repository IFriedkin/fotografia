/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotografia;

/**
 *
 * @author Ibrahim González
 */
public class Clientes {
    private String nif;
    private String nombre;
    private String direccion;
    private String numTelefono;
    private String email;

    public Clientes(String nif, String nombre, String direccion, String numTelefono, String email) {
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.email = email;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", numTelefono=" + numTelefono + ", email=" + email + '}';
    }
    
    
}
