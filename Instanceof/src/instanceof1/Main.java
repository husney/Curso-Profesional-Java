/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceof1;

/**
 *
 * @author usney
 */
public class Main {
    
    public static void main(String []args){
        
        
        
    
        
       
         Elipse e;
        e = new Elipse();
        
        verificarInstancia(e);
        System.out.println("");
        verificarTodos(e);
        
        
        FiguraGeometrica f;
        f = new Elipse();
        
        System.out.println("----------");
        verificarInstancia(f);
        System.out.println("");
        verificarTodos(f);
        
        
        System.out.println("-----------");
        FiguraGeometrica a;
        a = new Triangulo();
        
        verificarInstancia(a);
        System.out.println("");
        verificarTodos(a);
        
    }
    public static void verificarInstancia(FiguraGeometrica figura){
        if(figura instanceof Elipse){
            figura.dibujar();
        }
        else if(figura instanceof Circulo){
            System.out.println("Es un circulo");
        }
        else if(figura instanceof FiguraGeometrica){
            System.out.println("Es una Figura Geometrica");
        }
        else if(figura instanceof Triangulo){
            System.out.println("Es un Triangulo");
        }
    }
    
    private static void verificarTodos(FiguraGeometrica figura){
        if(figura instanceof Elipse){
            System.out.println("Es un Elipse");
        }
        if(figura instanceof Circulo){
            System.out.println("Es un Circulo");
        }
        if(figura instanceof FiguraGeometrica){
            System.out.println("Es una Figura Geometrica");
        }
        if(figura instanceof Triangulo){
            System.out.println("Es un Triangulo");
        }
    }
}

