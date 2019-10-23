
package clase.abstracta;

import java.util.Scanner;
public class ClaseAbstracta {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        
            
            Figuras f[]= new Figuras[2];
       
        
        Figuras c= new Circulo(9);
        Triangulo t= new Triangulo(10,5);
        
        f[0]=c;
        f[1]=t;
        
        System.out.println(f[0].area());
        System.out.println(f[1].area());
String resultado = t.getTitulo();
            
            System.out.println(Circulo.pi);


                System.out.println(t.getTitulo());

    
    
 
    
    
    }
    
}
