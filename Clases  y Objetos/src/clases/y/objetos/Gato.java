
package clases.y.objetos;


public class Gato extends Mascota {
            
    public Gato(String nombre, String raza, int edad){
        super(nombre,raza,edad);
    }
       
  
    
  
     public void dormir(){
         System.out.println("El gato "+this.nombre+" esta durmiendo");
         super.dormir();
     }
    
    
    
    
    
    
    
    
    
    
    
    
}
