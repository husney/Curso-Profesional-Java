package contextoestatico;


public class ContextoEstatico {


    public static void main(String[] args) {

            Persona p1 = new Persona ("Juan");

            System.out.println(p1);
            
            Persona p2 = new Persona ( "Karla");
            
            System.out.println(p2);


            System.out.println("personas: "+Persona.getContadorPersonas());
            
            String  i = " ";
            
            






    }
    
}
class Persona extends ContextoEstatico{
    private String nombre;
    private int idPersona;
    public static int contadorPersonas;
    
    public Persona(String nombre){
        this.idPersona=contadorPersonas++;
        this.nombre = nombre;
    }
    public int getIdPersona(){
        return idPersona;
    }
    
    
    public void setIdPersona(int idPersona){
        this.idPersona= idPersona;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
    public String toString(){
        return "Id Persona: "+idPersona+" Nombre: "+nombre ;
    }
    
    public static void hola(){
        System.out.println("Hola");
    }
} 