package c9;
import java.util.Scanner;

/*Dado un número entero obtener su factorial.*/
public class C9 {

    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    int numero = 0;
    int factorial = 1;
    
    System.out.println("Ingrese un numero para hallar su factorial");
    numero= entrada.nextInt();
    
    
    for(int i = 1;i<=numero;i++){
        
        factorial = factorial * i;
    }
    System.out.println(factorial);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
