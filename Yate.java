
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    private int camarotes;
    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarote, int potencia, String matricula, float eslora, int anoFab)
    {
        super(potencia, matricula, eslora, anoFab);
        camarotes = camarote;
    }
    
    /**
     * @Override getCoeficienteBernua
     */
    public int getCoeficienteBernua(){
        return super.getCoeficienteBernua() + camarotes;
    }
    
    /**
     * @Override toString
     */
    public String toString(){
        return super.toString() + ", numero de camarotes = " + camarotes;
    }
}
