
package ejercicios;

/**
 *
 * @author usney
 */
public class Prueba {
    private final int idPersona;
    private static int contadorPersonas;
    private String nombre;
    private String apellido;
    private int edad;
    
    static{
        System.out.println("Por favor ingrese su nombre y despues su apellido y su edad");
        contadorPersonas = 10;
    }
    {
        System.out.println("Ejecuta bloque anonimo");
        idPersona = ++contadorPersonas;
    }
    
    Prueba(String nombre, String apellido, int edad){
        System.out.println("Ejecutar constructor");
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
}
