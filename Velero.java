
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numeroMastiles;
    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles, String matricula, float eslora, int anoFab)
    {
        super(matricula, eslora, anoFab);
        this.numeroMastiles = numeroMastiles;
    }
    
    /**
     * @Override getCoeficienteBernua
     */
    public int getCoeficienteBernua(){
        return numeroMastiles;
    }
    
    /**
     * @Override toString
     */
    public String toString(){
        return super.toString() + ", numero de mastiles = " + numeroMastiles;
    }
}
