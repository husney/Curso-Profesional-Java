
package holamundo;
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
//      
//        System.out.println("ingrese el alto");
//        int alto= sc.nextInt();
//        
//        System.out.println("ingrese el ancho");
//        int ancho= sc.nextInt();
//    
//        int area = alto*ancho;
//        int perimetro = (alto + ancho)*2;
//        System.out.println("El area del cuadrado es: "+area );
//        System.out.println("El perimetro es:"+perimetro);
//    
    
           
//           int a = (int)(Math.random()*100);
//           int numero = 0;
//           int intentos = 0;
//           do
//           {
//               numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
//           
//                if(a < numero ){
//                    JOptionPane.showMessageDialog(null, "El numero es Menor");
//                }
//                else if( a > numero){
//                    JOptionPane.showMessageDialog(null, "El numero es Mayor");
//                }
//                if ( a == numero){
//                    JOptionPane.showMessageDialog(null, "El numero es correcto ha tenido " +intentos+" intentos");
//                }
//                intentos++;
//            }while(numero != a);
//            System.out.println((3/2)*4);
//            System.out.println("Ingrese un numero entero");
//            int a = sc.nextInt();
//            System.out.println("Ingrese un numero decimal");
//            double b = sc.nextDouble();
//            sc.nextLine();
//            System.out.println("Ingrese su nombre");
//            String n = sc.nextLine();
//            
//            
//            System.out.println(a);
//            System.out.println(b);
//            
//            System.out.println(n);

//        System.out.println("Ingrese el primer numero");
//        int n1 = sc.nextInt();
//        System.out.println("Ingrese el segundo numero");
//        int n2 = sc.nextInt();
//        
//        int res = n1 > n2 ?n1:n2;
//        System.out.println(res);




//        int a = 2;
//        int b = 3;
//        int res = -3 + 6 / ++a * 4 - b-- + b;
//        //Se evalua: 6 / ++a (donde 'a' se preincrementa y vale 3)
//        System.out.println(6 / 3); //Imprime 2
//        //Se evalua: 2 * 4
//        System.out.println(2 * 4 ); //imprime 8
//        //Se evalua -3 + 8
//        System.out.println(-3 + 8); //imprime 5
//        //Se evalua 5 - b-- (donde b primero se asigna 3, y luego se decrementa)
//        System.out.println(5 - 3); //imprime 2
//        //Se evalua 2 + b (teniamos pendiente un decremento de b, vale 2)
//        System.out.println(2 + 2);//imprime 4,
//        //System.out.println("res = " + res); //es el mismo valor que el valor final
// 
// 
//        //Agrupando con parentesis tenemos:
//        //Recordar que las expresiones se evaluan de izquierda a derecha
//        //y se comienza a agrupar aplicando la precedencia de operadores
//        //int res2 = ((-3 + ((6 / ++a) * 4)) - b--) + b;
//        //System.out.println("res2 = " + res2);

           
//      System.out.println("Ingrese la calificación");
//      double  nota = sc.nextDouble();
//      
//      if( nota >=9 && nota <=10){
//          System.out.println("A");
//      }
//      else if ( nota >=8 && nota <9){
//          System.out.println("B");
//      }
//      else if ( nota >=7 && nota <8){
//          System.out.println("C");
//      }
//      else if (nota >=6 && nota <7){
//          System.out.println("D");
//      }
//      else if (nota >=0 && nota <6){
//          System.out.println("F");
//      }
    
    
    
//    int n = 3 ;
//    
//    switch (n){
//        
//        case 0 :
//            System.out.println("el numero es cero");
//            break;
//        
//        case 1 :
//            System.out.println("El numero es uno");
//            break;
//         
//        case 2 :
//            System.out.println("El numero es dos f");
//            break;
//        case 3:
//            System.out.println("EL numero es tres");
//         
//        default:
//            System.out.println("Numero desconocido");
//    }
    
//        System.out.println("Ingrese el numero del mes");
//    int mes = sc.nextInt();
//    String estacion = " ";
//    String meses = " ";
//    String prueba = " ";
//    switch (mes){
//        
//        case 1 :
//            meses ="Enero";
//            estacion = "Invierno";
//            break;
//            
//        case 2:
//            meses="Febrero";
//            estacion = "Invierno";
//            break;
//            
//        case 3:
//            meses ="Marzo";
//            estacion = "Primavera";
//            break;
//            
//        case 4:
//            meses = "Abril";
//            estacion = "Primavera";
//            break;
//            
//        case 5:
//            meses = "Mayo";
//            estacion = "Primavera";
//            break;
//            
//        case 6: 
//            System.out.println("Junio");
//            estacion ="Verano";
//            break;
//            
//        case 7:
//            meses ="Julio";
//            estacion = "Verano";
//            break;
//            
//        case 8:
//            meses ="Agosto";
//            estacion = "Verano";
//            break;
//            
//        case 9: 
//            meses = "Septiembre";
//            estacion ="Otoño";
//            break;
//            
//        case 10:
//            meses ="Octubre";
//            estacion = "Otoño";
//            break;
//            
//        case 11:
//            meses = "Noviembre";
//            estacion = "Otoño";
//            break;
//            
//        case 12:
//            meses = "Diciembre";
//            estacion = "Invierno";
//            break;
//            
//        default:
//            System.out.println("Numero equivocado");
//    }
//    
//        
//    System.out.println("Mes:"+meses+" Estación:"+estacion );
//    
//    
//    int i = 0;
//    
//    while (i < 5){
//        System.out.println(i);
//        i++;
//    }
//    
//    System.out.println("numero final de variable  "+i);

     
//                    for(int i = 1 ; i <= 100 ; i++){
//                        if (i % 2 !=0){
//                           continue;
//                        }
//                        System.out.println(i);
//                        
//                       
//                    }
    
    }
    
}
 