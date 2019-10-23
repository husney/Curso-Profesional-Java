
package ejercicios;

public class Calculo {

    public static int calculo(int n1, int n2, int n3){
       int mayor = 0;
        
        if(n1>n2 && n1 > n3 ){
            mayor = n1;
        }
        else if(n2 > n1 && n2 > n3){
            mayor = n2;
        }
        
        else{
            mayor = n3;
        }
        
        
        
        return mayor;
    }
    
}
