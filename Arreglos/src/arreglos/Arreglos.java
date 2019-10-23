
package arreglos;
import javax.swing.JOptionPane;
public class Arreglos {

    
    public static void main(String[] args) {
//        Persona p = new Persona();
        
        int ref=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de referencia de la persona"));
        
        Persona personas[] = new Persona[5];
        
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Carlos","Lara");
        personas[2] = new Persona("Maria","Camila");
        personas[3] = new Persona("Valentina", "Marin");
        personas[4] = new Persona ("Natalia","Rodriguez");
        
        
//        for (int i = 0 ; i<personas.length; i++){
//            System.out.println(personas[i].toString());
//        }
//        int a = p.getcontadorPersonas();
//        
//        System.out.println(a);
//        System.out.println(personas[3].getNombre()+" "+ personas[3].getApellido());
//        
        Persona per = personas[ref];
        
        System.out.println(per.getNombre()+" "+per.getApellido()+" "+per.getId());
        

//            String nombres[] = new String[5];
//            
//            nombres[0]= "Andres";
//            
////            System.out.println(nombres[0]);
//
////                Persona p1 = new Persona("Andres", "Calderon");
//                
//               System.out.println(nombres[0]);
    }
    
}
