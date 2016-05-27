
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    private int potencia;
    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia, String matricula, float eslora, int anoFab)
    {
        super(matricula, eslora, anoFab);
        this.potencia = potencia;
    }
    
    /**
     * @Override getCoeficienteBernua
     */
    public int getCoeficienteBernua(){
        return potencia;
    }
    
    /**
     * @Override toString
     */
    public String toString(){
        return super.toString() + ", la potencia es = " + potencia;
    }
}
