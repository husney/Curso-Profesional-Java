
package c10;


public class C10 {

   /* Crear un arreglo cual nos permita almacenar cien números enteros. */
    public static void main(String[] args) {
       
       int p[]= {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 ,97};
       int n= 0 ;
       for(int i = 0 ; i < p.length; i++){
           int c = 0;
           for(int j = 1 ; j<=p[i] ;j++){
               if(p[i] % j == 0){
                   c++;
               }
               if(c==2){
                   
                   System.out.println("Primos: -"+ p[i]+ "         "+n);
               }
           }
       }
    
        

    
    
    
    
    }
    
  
    
}
