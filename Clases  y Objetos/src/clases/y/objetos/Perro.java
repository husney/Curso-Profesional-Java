package clases.y.objetos;


public class Perro extends Mascota {
       
   public Perro(String nombre, String raza, int edad){
       super(nombre,raza,edad);
   }
   
    
     public void dormir(){
         System.out.println("El perro "+this.nombre+" esta durmiendo");
         super.dormir();
     }
             
             
             
             
             
             
             
}
