
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    private String matricula;
    private float eslora;
    private int anoFabricacion;
    private int amarre;
    
    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, float eslora, int anofab)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = anofab;
    }
    
    /**
     * Metodo que devuelve la matricula en String
     */
    public String getMatricula(){
        return matricula;
    }
    
    /**
     * Metodo que devuelve la eslora en float
     */
    public float getEslora(){
        return eslora;
    }
    
    /**
     * Metodo que devuelve el año de fabricacion en int
     */
    public int getAnoFabricacion(){
        return anoFabricacion;
    }
    
    /**
     * Metodo que da un valor del amarre
     */
    public void amarrar(int amarre){
        this.amarre = amarre;
    }
    
    /**
     * Metodo que devuelve el amarre
     */
    public int getAmarre(){
        return amarre;
    }
    
    public abstract int getCoeficienteBernua();
    
    /**
     * @Override toString
     */
    public String toString(){
        return "La matricula del barco = " + matricula + ", la eslora = " + eslora + ", el año fabricacion = " + anoFabricacion;
    }
    
}
