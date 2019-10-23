
package array.parametro;


public class Arreglo {
    
    String nombre;
    String apellido;
    int edad= 0;
    
    
    Arreglo(String nombre, String apellido , int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    public void datos(){
        System.out.println("Nombre: "+this.nombre +" \nApellido: "+this.apellido + " \nEdad: " + this.edad);
    }
    public void estado(){
        System.out.pringln(this.nombre+"Se encuentra estudiando por que es el mejor programador y un millonario");
    }
    
    
}
