
package pkgreturn;
public class Return {
    public static void main(String[] args) {

//            int resultado = sumar(5,1);
//            System.out.println("resultado = " + resultado);
//
//    }
//        
//    static int sumar (int a , int b){
//        return a + b;

//        Suma s = crearObjetoSuma();
//        int resultado= s.a +s.b;
//        System.out.println(resultado);
//    
//    }
////    public static Suma crearObjetoSuma(){
////        Suma s = new Suma (5,3);
////        return s;
////    }
//}
    
//class Suma{
//    int a ;
//    int b ;
//    
//    Suma (int a , int b){
//        this.a = a;
//        this.b = b;
//    }
//}
    
        Suma s = new Suma(5,4);
        System.out.println(s.sumar());
    
    }

}
class Suma {
    int a ;
    int b ;
    
        Suma( int a, int b){
            this.a = a;
            this.b = b;
        }
        
        
        public int sumar(){
            return a+b;
        }
}
