
package bloquescodigo;

/**
 *
 * @author usney
 */
public enum Persona {
    
    VALENTINA("Marin",19),
    NATALIA("Torres",22),
    GABI("Stolac",20),
    SARA("Orrego",23);

    
    private String nombre;
    private int edad;
    
    
    private Persona(String nombre, int edad){
        
        this.nombre = nombre;
        this.edad = edad;
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
   
    public int getEdad(){
        return this.edad;
    }
}
