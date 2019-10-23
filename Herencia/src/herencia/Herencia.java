
package herencia;

import java.util.Date;

public class Herencia {

    public static void main(String[] args) {

        Empleado e1 = new Empleado ("juan", 2500);

        e1.setEdad(27);
        e1.setGenero('M');
        e1.setDireccion("calle 15");
        System.out.println("empleado1"+e1);
        

        
        
        Cliente c1 = new Cliente (new Date(), true);
        c1.setDireccion("torre 5");
        c1.setNombre("Andrea");
        c1.setGenero('F');
        c1.setEdad(24);
        System.out.println(c1);
        

        Cliente c2 = new Cliente (new Date(), false);
        System.out.println(c2);

    }
    
}
