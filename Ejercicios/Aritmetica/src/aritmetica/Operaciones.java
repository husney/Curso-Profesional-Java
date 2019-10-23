
package aritmetica;

public class Operaciones {
    
        int a;
        int b;
        
        
        Operaciones ( int a , int  b){
           this.a = a;
           this.b = b;
        }
        
        public int sumar (){
            return a+b;
        }
        public int restar(){
        
            return a - b;
        }
        
        public int multiplicar(){
            return a * b;
        }
        
        public int dividir (){
            
            return a / b;
        }
        
        public int modulo(){
            return a % b;
        }

}
