
package m2;




public class M2 {

   
    public static void main(String[] args) {
            
        int prom= 0 ;
        int suma = 0 ;
        int mayor = 0;
        int a [][] = new int [5][5];
    
    for(int i = 0; i < a.length; i++){
        for (int j = 0; j<a[i].length; j++){
            a[i][j]= (int)(Math.random()*100);
            
            suma= suma +a[i][j];
            prom = suma /a.length;
        System.out.print(a[i][j]+ "  ");
     
      
       
        }   System.out.println();
    } System.out.println("Promedio"+prom);
        
     
    
    for(int i = 0 ; i <a.length; i++){
        for(int j =  0 ; j < a.length; j++){
            if(mayor < a[i][j]){
                mayor = a[i][j];
            }
        }
    }
    System.out.println("Mayor"+mayor);
    
    int contador =0;
    int numero = mayor;
    for(int i = 0 ; i < a.length ; i++){
        for(int j = 0 ; j < a.length ; j++){
            if(numero == a[i][j]){
                contador++;
            }
        }
    }
    
    
    System.out.println("Se repite " +contador);
            
    for(int i = 0; i < a.length ; i++){
        for(int j = 0 ; j<a.length; j++){
         int c = 0;
            for(int x = 1; x <= a[i][j]; x++){
                if( a[i][j] % x == 0){
                    c++;
                }
            }if(c == 2){
                System.out.println("Numero Primo: "+a[i][j]);
            }
        }
    }
           
    for(int i = 0 ; i<a.length ; i++){
        for(int j = 0 ; j<a.length; j++){
            if(a[i][j] % 2 == 0 ){
                System.out.println("Par: "+a[i][j] );
            }
        }
    }
    
    
    int suma2=(a[0][0]+a[1][1])+(a[2][2]+a[3][3])+a[4][4];
    int suma3=(a[4][0]+a[3][1])+(a[2][2]+a[1][3])+a[0][4];
    int ultimafila=(a[4][4]+a[4][3])+(a[4][2]+a[4][1])+a[4][0];
    System.out.println("Suma diagonal 0,0: 1,1: 2,2: 3,3: 4,4  = "+suma2);
    System.out.println("Suma diagonal 4,0: 3,1: 2,2: 1,3: 0,4  = "+suma3);
    System.out.println("Suma ultima fila = "+ultimafila);
  
   
    boolean cuadro =false;
    for(int  i = 0; i <a.length; i++){
        for( int j = 0; j<a.length; j++){
            if(a[i] == a[j]){
            cuadro=true;    
            }
        }
    }
    if(cuadro == true){
        System.out.println("Cuadro Mágico");
    }
    
    
    
    }
    
}
