
package pkgenum;

/**
 *
 * @author usney
 */
public class Enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       for(Personas p : Personas.values()){
           System.out.printf(p+" "+p.getEdad()+"\n");
       }
       
        
        
    }
    
}
