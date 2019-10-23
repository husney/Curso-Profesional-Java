
package modificadoresacceso;

import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

/**
 *
 * @author usney
 */
public class ModificadoresAcceso {
 
    public static void main (String args[]){
        
        
        System.out.println("Accceso desde Clase 2 a Clase 1 (mismo paquete)");
        new Clase2().puebaDesdeClase2();
        
        System.out.println("\nAcceso desde Clase 3 a Clase 1 (Diferentes paquetes, pero es sub clase)");
        new Clase3().pruebaDesdeClase3();
        
        System.out.println("\nAcceso desde Clase 4 a Clase 1 (Diferentes paquetes, no es sub clase)");
        new Clase4().pruebaDesdeClase4();



    }
}
