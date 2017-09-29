package fotografia;

/**
 *
 * @author Ibrahim González
 */
public class Camara {
    /**
     * Objeto que almacena la información de la marca.
     */
    private Marca marca;
    
    /**
     * Módelo de la cámara.
     */
    private String modelo;
    
    /**
     * Flash de la cámara.
     */
    private boolean flash;

    /**
     * Constructor parametrizado de la clase Camara.
     * @param marca Marca | Objeto que almacena la información de la marca.
     * @param modelo String | Modelo de la cámara.
     * @param flash boolean | Flash de la cámara.
     */
    public Camara(Marca marca, String modelo, boolean flash) {
        this.marca = marca;
        this.modelo = modelo;
        this.flash = flash;
    }

    //Getters
    public Marca getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public boolean isFlash() {return flash;}
    
    //Setters
    public void setMarca(Marca marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setFlash(boolean flash) {this.flash = flash;}

    /**
     * étodo que muestra la información de una cámara de forma ordenada.
     * @return 
     */
    @Override
    public String toString() {
        String tiene;
        if(!flash){tiene = "No tiene";}else{tiene = "Tiene";}
        return "Cámara:\n" + "Marca: " + marca.getNombre() + 
                "\nModelo: " + modelo + "\nFlash: " + tiene + '}';
    }
    
    
}
