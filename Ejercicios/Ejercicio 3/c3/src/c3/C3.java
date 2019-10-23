
package c3;

                                        /* imprimir en consola la tabla de multiplicar del número 9. */
public class C3 {

  
    public static void main(String[] args) {
     
        
        int tabla = 9;
        int resultadof = 0;
        int resultadow = 0;
        
        for (int i = 1; i<=10; i++){
            resultadof = i * tabla;
            System.out.println(i+ " X "+tabla+ " = " + resultadof+ "               FOR"   );
        }
        System.out.println("-----------------------------------------------------------------------------------");
        
        int x =1;
        while (x<=10){
            resultadow = x * tabla;
            System.out.println (x+ " X " +tabla+ " = "+resultadow+ "                   While");
            x++;
        }
        
    }
    
}
