
package c2;


public class C2 {

   
    public static void main(String[] args) {
        
        /*Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50*/
        
        int n1 = 3;
        int n2 = 1;
        int n3 = 2;
  
        
     if (n1<n2 && n1<n3){
         
         if (n2<n3){
             System.out.printf("%d %d %d " ,n1,n2,n3);
         }
         else if (n3<n2){
             System.out.printf("%d %d %d ",n1,n3,n2);
         }
         
     }
     else if (n2<n1 && n2<n3){
         
         if (n1<n3){
             System.out.printf("%d %d %d ",n2,n1,n3);
         }
         else if (n3<n1){
             System.out.printf("%d %d %d ",n2,n3,n1);
         }
     }
     else if (n3<n2 && n3<n1){
         
         if (n1<n2){
             System.out.printf("%d %d %d ",n3,n1,n2);
         }
         else if (n2<n1){
             System.out.printf("%d %d %d ",n3,n2,n1);
         }
     }
        
        
        
        
        
     
    }
    
}
