
package sobrecargametodos;

public class SobrecargaMetodos {
    public static void main(String[] args) {

           int resultado =Operaciones.sumar(5, 6);
           
           System.out.println("resultado = " + resultado);  
           
           System.out.println("Resultado dobule "+Operaciones.sumar(5.4,5.3));
           System.out.println("Resultado int y double"+Operaciones.sumar( 5, 5.8));
           System.out.println("Resultado 3: "+Operaciones.sumar(5 , 2));
    }
    
}
