
package c7;
import java.util.Scanner;
public class C7 {

            /* Dado un número saber si este es primo o no. */

    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        
        int numero =0; 
        int contador = 0;
            System.out.println("Ingrese un numero para saber si es primo o no");
            numero = sc.nextInt();
            
                for(int i = 1 ; i <= numero; i++){
                    
                    if (numero % i == 0){
                        contador+= 1;
                    }
                }
                if (contador ==2){
                    System.out.println("El numero es primo");
                }
                else {
                    System.out.println("El numero no es primo");
                }
    }
    
}
