
package c8;

public class C8 {

  /* Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570 */
    public static void main(String[] args) {
        
        int i = 1;
        
        while (i<4570){
            
            if (i % 2 == 0){
                System.out.println("El numero "+i + " es primio");
            }
            i++;
        }
    }
    
}
