package pruebaclase;




public class PruebaClase {


    public static void main(String[] args) {

           Persona manuel = new Persona ();
           
           manuel.nombreyapellido();
            
 
           manuel.nombre= "Andres";
           manuel.apellido= "Fustiniano";
            
           manuel.nombreyapellido();

           Persona caro = new Persona();
           
           
           caro.nombre= "Caro";
           caro.apellido= "Ramirez";
           caro.nombreyapellido();

           int s =caro.suma(5, 4);
           
           System.out.println(s);

    }
    
}
