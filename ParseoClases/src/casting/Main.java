package casting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usney
 */
public class Main {
    public static void main(String []args){
        
        
        
        
        
//
//        Persona p = new Escritor("Rodriguez", 50, 1554210, 5000, TipoEscritura.MODERNA);
//        
//       getDesc(p);
//       
//        p = new Gerente("Gerente 1 ",40, 545025, 4000, "Sistemas");
//        getDesc(p);
       
        
    }  
    
    public static void getDesc(Persona per){
        
        if(per instanceof Escritor){
            System.out.println(per.toString());
            System.out.println(((Escritor)per).getTipoEscrituraDescripcion());
            System.out.println("");
        }
        
        if(per instanceof Gerente){
            System.out.println(per.toString());
            System.out.println(((Gerente)per).getDepartamento());
            System.out.println("");
        }
        
        
    }
}
