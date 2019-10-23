
package sobre.carga;


public class Carga {
    
    
    public static String nombre = "Husney";
    
    public static int suma(int... numeros){
        int suma= 0;
        System.out.println(numeros.length+" Numeros");
        for(int i = 0; i<numeros.length; i++){
            suma += numeros[i];
        }
        return suma;
    }
    
    
    public double suma(double ... numeros){
        int suma = 0;
        for(int i = 0 ; i < numeros.length; i++){
            suma +=numeros[i];
        }
        return suma;
    }
    
    
   public static int po (int numero, int potencia){
       return (int) Math.pow(numero, potencia);
   }
    
    
    public static int resta(int... numeros){
        int resta=0;
    
        for(int i = 0 ; i< numeros.length;i++){
            resta =resta - numeros[i];
        }
        return resta;
    }
    
    public void saludando(){
        
     
        sobre na = new sobre();
        System.out.println(na.multi(2,2,2,2,2,2,2,2));
        
        
    }
          
        
    
    public class sobre{
        
        void saludar(){
            System.out.println("Hola "+nombre);
        }
        
        
         int multi(int... numero ){
           int mul= 1;
             for(int i = 0 ; i <numero.length;i++){
                mul *= numero[i];
            }
             return mul;
             
             
        }
        
        
    
}
    
    
}
