package a2;
public class A2 {

    public static void main(String[] args) {


            int [] numeros = new int [100];
            
            for(int i = 0; i<numeros.length; i++){
                
                numeros[i]= (int)(Math.random()*100);
            }
        

//                for(int i = 0 ; i < numeros.length ; i ++){
//                    System.out.println(numeros[i]);
//                }
            
            for(int nuevo : numeros){
                System.out.println(nuevo);
            }
                    





    }
    
}
