import java.util.ArrayList;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private ArrayList<Alquiler> alquileres;
    private static final int NUMERO_AMARRES = 4;
    private int codigoAmarre;
    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<Alquiler>();
        codigoAmarre = 0;
    }

    /**
     * Metodo que añade un alquiler al Array devuelve la posicion o -1 en caso de que este lleno
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco){
        int posicion = -1;
        if(alquileres.size()<NUMERO_AMARRES){
            Barco barco1 = barco;
            if(codigoAmarre%2==0){
                barco1.amarrar(1);
                alquileres.add(0, new Alquiler(numeroDias, cliente, barco1));
                posicion = 0;
            }
            else{
                int cont = 0;
                boolean encontrado = false;
                while(cont < NUMERO_AMARRES && !encontrado){
                    if((codigoAmarre - (1+(NUMERO_AMARRES*cont)) == 0)){
                        barco1.amarrar(2);
                        alquileres.add(1, new Alquiler(numeroDias, cliente, barco1));
                        posicion = 1;
                        encontrado = true;
                    }
                    cont++;
                }
                cont = 0;
                encontrado = false;
                while(cont < (NUMERO_AMARRES/2) && !encontrado){
                    if((codigoAmarre - (3 + ((NUMERO_AMARRES*2)*cont)) == 0)){
                        barco1.amarrar(4);
                        alquileres.add(2, new Alquiler(numeroDias, cliente, barco1));
                        posicion = 2;
                    }
                    cont++;
                }
                if(codigoAmarre == 7){
                    barco1.amarrar(8);
                    alquileres.add(new Alquiler(numeroDias, cliente, barco1));
                    posicion = 3;
                }
            }
            codigoAmarre += barco1.getAmarre();
        }
        return posicion;
    }

    /**
     * Metodo que muestra los amarres que estan alquilados y los que estan vacios
     */
    public void verEstadoAmarres(){
        int amarre = 0;
        int i = 0;
        if(codigoAmarre%2==0){
            System.out.println("El amarre " + (amarre+1) + " esta vacio");
        }
        else{
            System.out.println("El amarre " + (amarre+1) 
                + " esta alquilado, el valor del alquiler es = " + alquileres.get(i).getCosteAlquiler());
            i++;
        }
        amarre++;
        int cont = 0;
        boolean encontrado = false;
        while(cont < NUMERO_AMARRES && !encontrado){
            if((codigoAmarre - (1+(NUMERO_AMARRES*cont)) != 0)){
                encontrado = true;
            }
            cont++;
        }
        if(encontrado){
            System.out.println("El amarre " + (amarre+1) 
                + " esta alquilado, el valor del alquiler es = " + alquileres.get(i).getCosteAlquiler());
            i++;
        }
        else{
            System.out.println("El amarre " + (amarre+1) + " esta vacio");
        }
        amarre++;
        cont = 0;
        encontrado = false;
        while(cont < (NUMERO_AMARRES/2) && !encontrado){
            if((codigoAmarre - (3 + ((NUMERO_AMARRES*2)*cont)) != 0)){
                encontrado = true;
            }
            cont++;
        }
        if(encontrado){
            System.out.println("El amarre " + (amarre+1) 
                + " esta alquilado, el valor del alquiler es = " + alquileres.get(i).getCosteAlquiler());
            i++;
        }
        else{
            System.out.println("El amarre " + (amarre+1) + " esta vacio");
        }
        amarre++;
        if(codigoAmarre == 8){
            System.out.println("El amarre " + (amarre+1) 
                + " esta alquilado, el valor del alquiler es = " + alquileres.get(i).getCosteAlquiler());
            i++;
        }
        else{
            System.out.println("El amarre " + (amarre+1) + " esta vacio");
        }
    }

    /**
     * Metodo que liquida un alquiler y devuelve su coste en float
     */
    public float liquidarAlquiler(int posicion){
        float valor = -1;
        int cont = 0;
        while(cont < alquileres.size() && valor == -1){
            if(alquileres.get(cont).getBarco().getAmarre() == Math.pow(2, posicion)){
                valor = alquileres.get(cont).getCosteAlquiler();
                alquileres.remove(cont);
                codigoAmarre -= (int)Math.pow(2, posicion);
            }
            cont++;
        }
        return valor;
    }
}