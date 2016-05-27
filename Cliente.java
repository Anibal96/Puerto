
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    /**
     * Metodo que devuelve el nombre del cliente en String
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo que devuelve el dni en String
     */
    public String getDni(){
        return dni;
    }
    
    /**
     * @Override toString
     */
    public String toString(){
        return "nombre cliente = " + nombre + "DNI cliente = " + dni;
    }
}
