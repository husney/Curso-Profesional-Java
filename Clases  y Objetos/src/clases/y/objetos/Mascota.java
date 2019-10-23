
package clases.y.objetos;


public class Mascota {
    
    String nombre;
    String raza;
    int edad;
    
     public Mascota(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        
    }
    
     public void dormir(){
          System.out.println("La mascota esta durmiendo");
      }
      
      public String getNombre(){
          return nombre;
      }
      public String getRaza(){
          return raza;
      }
     public void setNombre(String nombre){
         this.nombre = nombre;
     }
     public void setRaza(String raza){
         this.raza = raza;
     }
    
    
}
