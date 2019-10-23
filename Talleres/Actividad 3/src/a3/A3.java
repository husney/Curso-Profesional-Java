package a3;

public class A3 {
    
        /*
Mostrar en consola el número mayor.*
Mostrar en consola el número menor.**
Mostrar en consola todos los números primos.*
Mostrar en consola todos los números pares.*
Mostrar en consola el arreglo de forma ascendente.**
Mostrar en consola el promedio del arreglo.*
Mostrar en consola la suma del primer y último elemento del arreglo.*
Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.**/
    public static void main(String[] args) {
        
        int sumat= 0;
        int suma = 0;
        int prom =0;
        int n = 0;
        int menor = 100;
        int mayor = 0;
        int a[] = new int [100];
        String cien= " ";
        
        // NUMERO MAYOR Y NUMERO MENOR  
        for(int i = 0; i < a.length; i ++){
            a[i]= (int)(Math.random()*100);
            sumat=a[0]+a[99];
            n= n + 1;
                System.out.println("Array Posición "+n+ " :   "+a[i] );
                if( a[i] == 100){
                   cien=("Existe cien");
                }
        }
        
        for(int i = 0 ; i <a.length; i++){
            if(mayor <a[i]){
                mayor= a[i];
                
            }
            if(menor > a[i]){
                menor= a[i];
            }
        }
        // NUMEROS PARES
        for(int i = 0; i<a.length; i++){
         if(a[i] % 2 == 0){
             System.out.println("Numero Par:"+a[i]);
         }   
        }
        // NUMEROS PRIMOS
        for(int i = 0 ; i < a.length; i++){
            int c= 0 ;
                for(int j = 1; j<= a[i]; j++){
                    if(a[i] % j == 0){
                        c++;
                    }
                }
                if( c == 2){
                        System.out.println("Numero Primo " + a[i]);
                    }
        }
        
            //ORDENAR ARRAY
            for(int i = 0; i<a.length-1 ;i++){
                for(int j = 0 ; j<a.length-1; j++){
                    if(a[j] > a[j+1]){
                        int aux= a[j+1];
                        a[j+1]= a[j];
                        a[j]= aux;
                }
              }
            }
        for(int i = 0 ; i < a.length ; i++){
            System.out.println("Orden : "+ a[i]);
        }
        
            //PROMEDIO
            for(int i = 0 ; i < a.length ; i++){
                suma+= a[i];
                prom=suma/100;
            }
        
        
                 
        
        
        
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+ menor);
        System.out.println("Promedio: "+prom);
        System.out.println("Suma primer termino y ultimo termino: "+sumat);
        System.out.println(cien);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
