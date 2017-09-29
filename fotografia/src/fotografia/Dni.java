package fotografia;

import java.util.Scanner;

/**
 * Clase dni.
 * @author Ibrahim González
 */
public class Dni {
    /**
     * número del dni.
     */
    private int numDni;
    
    /**
     * Letra del dni.
     */
    private char letra;

    /**
     * Constrictor parametrizado de la clase Dni.
     * @param numDni int | Número del dni.
     * @param letra char | Letra del dni.
     */
    public Dni(int numDni, char letra) {
        this.numDni = numDni;
        this.letra = letra;
    }

    /**
     * Constructorsin parametrizar de la clase Dni.
     */
    public Dni() {
    }
    
    /**
     * Método que se encarga de calcular la letra del DNI.
     * @return char | Letra del DNI.
     */
    private char calcularLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[numDni % 23];
    }
    
    /**
     * Método que pide el número del DNI.
     */
    public void altaDni() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce dni: ");
            numDni = sc.nextInt();
        } while (numDni <= 0);
        letra = calcularLetra();
    }
    
    /**
     * Devuelve el String del DNI en formato 99999999-A
     * @return String | DNI en el formato correcto.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(numDni);
        sb.append("-");
        sb.append(letra);
        return sb.toString();
    }
}