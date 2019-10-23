
package clases.y.objetos;


public class ClasesYObjetos {

   
   
    public static void main(String[] args) {
     
        Gato gato = new Gato("Bigotes", "Garfield", 2);
        Perro perro = new Perro("Chester", "Pincher", 4);
        
        System.out.println(gato.getNombre() +" Raza: "+ gato.getRaza());
        System.out.println(perro.getNombre() +" Raza: "+ perro.getRaza());
    }
    
}
