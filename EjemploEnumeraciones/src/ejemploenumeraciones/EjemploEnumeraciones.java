
package ejemploenumeraciones;

/**
 *
 * @author usney
 */
public class EjemploEnumeraciones {
    public static void main(String[] args) {

        System.out.println("Valor 1:" +Dias.LUNES);
        
        indicarDia(Dias.VIERNES);
        
        System.out.println("Continente no. 4"+Continentes.AMERICA);
        System.out.println("Paises en America"+Continentes.AMERICA.getPaises());
        
        
        System.out.println("");
        System.out.println(Continentes.AFRICA);
        
        System.out.println("");
       
        
        
        
        
        
        
    }   
    
    public static void indicarDia(Dias dias){
        
        switch (dias){
            case LUNES :
                System.out.println("Primer dia de la semana");
                break;
                
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
                
                
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
                
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
                
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
                
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
                
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        
        }
    }
    
    public static void indicarPaises(Continentes continentes){
        switch (continentes){
            case AFRICA:
                System.out.println("No. Paises en: "+continentes+" : "+ continentes.getPaises());

            case AMERICA:
                 System.out.println("No. Paises en: "+continentes+" : "+ continentes.getPaises());
                 break;
            
            case EUROPA:
                 System.out.println("No. Paises en: "+continentes+" : "+ continentes.getPaises());
                 break;
            
            case ASIA:
                 System.out.println("No. Paises en: "+continentes+" : "+ continentes.getPaises());
                 break;
           
            case OCEANIA:
                 System.out.println("No. Paises en: "+continentes+" : "+ continentes.getPaises());
                 break;
                
        }
    }
}
