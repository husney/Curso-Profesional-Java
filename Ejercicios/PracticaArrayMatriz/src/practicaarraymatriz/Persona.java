
package practicaarraymatriz;

public class Persona {
    
    
    public static int contadorPersonas;
    private String nombre;
    private String apellido;
    private  int id;
    
    private Persona(){
        this.id= ++contadorPersonas;
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
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public  int getContadorPersona(){
        return this.contadorPersonas;
    }
    
    public  int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "Persona " + "nombre = " + nombre + " | Apellido = " + apellido + " | id = " + id ;
    }
    
 
    

}
