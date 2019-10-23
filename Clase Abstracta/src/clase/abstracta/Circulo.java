
package clase.abstracta;
public class Circulo extends Figuras {

    
        public static final double pi= 3.14159;
        
        private double radio;
        
        public Circulo (double radio){
            this.radio= radio;
        }
        
        public double area(){//pi * radio ´´2
            return  pi* (this.radio * this.radio);
        }











    
}
