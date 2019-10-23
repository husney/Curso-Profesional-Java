
package pruebaarray;



public class Persona {

    private String nombre;
    private String apellido;
    private static int contadorPersonas;
    private int idPersona;
    
    private Persona(){
        this.idPersona = ++contadorPersonas;
        
    }
    
    public Persona(String nombre){
        this();
        this.nombre = nombre;
    }
    public Persona(String nombre, String apellido){
        this();
        this.nombre= nombre;
        this.apellido= apellido;
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

    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

   
    public  int getContadorPersonas() {
        return contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

   
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre = " + nombre + ", apellido = " + apellido + ", idPersona =" + idPersona;
    }

  
}

