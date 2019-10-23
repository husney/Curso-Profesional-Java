
package aritmetica;
public class Aritmetica {
    public static void main(String[] args) {

    int numeroa = 5;
    int numerob = 10;
        Operaciones a = new Operaciones(numeroa,numerob);

//        int resultados = a.sumar();
//        int resultador = a.restar();
//        int resultadom = a.multiplicar();
//        int resultadod = a.dividir();
//        int resultadores = a.modulo();

//        System.out.println("Suma: "+resultados+" Resta: "+resultador+" Multiplicación: "+resultadom +" División: "+resultadod +" Residuo: "+resultadores);
        
        
       System.out.println("Suma: "+ a.sumar());
        System.out.println("Resta: "+ a.restar());
        System.out.println("Multiplicación: "+a.multiplicar());
        System.out.println("División :" + a.dividir());
        System.out.println("Residuo :"+a.modulo());
        
        
        
        
        
    }
    
}
