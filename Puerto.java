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
            switch(codigoAmarre){
                case 0:
                barco1.amarrar(1);
                alquileres.add(new Alquiler(numeroDias, cliente, barco1));
                posicion = 0;
                break;
                case 1:
                barco1.amarrar(2);
                alquileres.add(1, new Alquiler(numeroDias, cliente, barco1));
                posicion = 1;
                break;
                case 2:
                barco1.amarrar(1);
                alquileres.add(0, new Alquiler(numeroDias, cliente, barco1));
                posicion = 0;
                break;
                case 3:
                barco1.amarrar(4);
                alquileres.add(2, new Alquiler(numeroDias, cliente, barco1));
                posicion = 2;
                break;
                case 4:
                barco1.amarrar(1);
                alquileres.add(0, new Alquiler(numeroDias, cliente, barco1));
                posicion = 0;
                break;
                case 5:
                barco1.amarrar(2);
                alquileres.add(1, new Alquiler(numeroDias, cliente, barco1));
                posicion = 1;
                break;
                case 6:
                barco1.amarrar(1);
                alquileres.add(0, new Alquiler(numeroDias, cliente, barco1));
                posicion = 0;
                break;
                case 7:
                barco1.amarrar(8);
                alquileres.add(3, new Alquiler(numeroDias, cliente, barco1));
                posicion = 3;
                break;
                case 8:
                barco1.amarrar(1);
                alquileres.add(0, new Alquiler(numeroDias, cliente, barco1));
                posicion = 0;
                break;
                case 9:
                barco1.amarrar(2);
                alquileres.add(1, new Alquiler(numeroDias, cliente, barco1));
                posicion = 1;
                break;
                case 10:
                barco1.amarrar(1);
                alquileres.add(0, new Alquiler(numeroDias, cliente, barco1));
                posicion = 0;
                break;
                case 11:
                barco1.amarrar(4);
                alquileres.add(2, new Alquiler(numeroDias, cliente, barco1));
                posicion = 2;
                break;
                case 12:
                barco1.amarrar(1);
                alquileres.add(0, new Alquiler(numeroDias, cliente, barco1));
                posicion = 0;
                break;
                case 13:
                barco1.amarrar(2);
                alquileres.add(1, new Alquiler(numeroDias, cliente, barco1));
                posicion = 1;
                break;
            }
            codigoAmarre += barco1.getAmarre();
        }
        return posicion;
    }

    /**
     * Metodo que muestra los amarres que estan alquilados y los que estan vacios
     */
    public void verEstadoAmarres(){
        switch(codigoAmarre){
            case 0:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                System.out.println("El amarre " + (cont+1) + " esta vacio");
            }
            break;
            case 1:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 0){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 2:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 1){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 3:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 0 || cont == 1){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 4:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 2){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 5:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 0 || cont == 2){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 6:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 1 || cont == 2){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 7:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 0 || cont == 1 || cont == 2){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 8:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 3){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 9:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 0 || cont == 3){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 10:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 1 || cont == 3){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 11:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 0 || cont == 1 || cont == 3){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 12:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 2 || cont == 3){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 13:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                if(cont == 0 || cont == 2 || cont == 3){
                    System.out.println("El amarre " + (cont+1) 
                        + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
                }
                else{
                    System.out.println("El amarre " + (cont+1) + " esta vacio");
                }
            }
            break;
            case 14:
            for(int cont = 0; cont < NUMERO_AMARRES;cont++){
                System.out.println("El amarre " + (cont+1) 
                    + " esta alquilado, el valor del alquiler es = " + alquileres.get(cont).getCosteAlquiler());
            }
            break;
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