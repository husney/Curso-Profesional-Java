
package arreglos;

public class Persona {
    
    private String nombre;
    private String apellido;
    private static int contadorPersonas;
    private int id ;
    
    public Persona(){
    this.id=contadorPersonas++;
    }
       
    
    public Persona(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public Persona(String nombre, String apellido){
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

   
    public String getNombre() {
        return nombre;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getcontadorPersonas(){
        return this.contadorPersonas -1;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + '}';
    }
    
    
}
