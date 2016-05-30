
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private Alquiler[] alquileres;
    private static final int NUMERO_AMARRES = 4;
    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Metodo que añade un alquiler al Array devuelve la posicion o -1 en caso de que este lleno
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco){
        int posicion = -1;
        for(int cont = 0;cont < NUMERO_AMARRES && posicion == -1;cont++){
            if(alquileres[cont]== null){
                posicion = cont;
                alquileres[cont] = new Alquiler(numeroDias, cliente, barco);
            }
        }
        return posicion;
    }
    
    /**
     * Metodo que muestra los amarres que estan alquilados y los que estan vacios
     */
    public void verEstadoAmarres(){
        for(int cont = 0; cont < NUMERO_AMARRES;cont++){
            if(alquileres[cont] == null)
                System.out.println("El amarre " + (cont+1) + " esta vacio");
            else{
                System.out.println("El amarre " + (cont+1) 
                + " esta alquilado, el valor del alquiler es = " + alquileres[cont].getCosteAlquiler());
            }
        }
    }
    
    /**
     * Metodo que liquida un alquiler y devuelve su coste en float
     */
    public float liquidarAlquiler(int posicion){
        float liquidacion = alquileres[posicion].getCosteAlquiler();
        alquileres[posicion] = null;
        return liquidacion;
    }
}