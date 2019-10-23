
package clase.abstracta;

public class Triangulo extends Figuras{

    private double base;
    private double altura;
    public String titulo = "Titulo";
    
    public Triangulo(double base, double altura){
        this.base= base;
        this.altura=altura;
        
    }
    //@Override
    public double area(){
        return (base * altura)/2;
    }
    
    
    public String getTitulo(){
        return titulo;
    }
    
}
