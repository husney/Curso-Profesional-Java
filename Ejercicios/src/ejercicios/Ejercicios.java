
package ejercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Ejercicios {

 /*
0 -100
101 – 150
151 –en adelante

1 salario
2 salarios minimos
3 salarios minimos*/
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su fecha de nacimiento");
        int f = sc.nextInt();
        
        Calendar c = new GregorianCalendar();
        
        int year = c.getWeekYear();
        
        int dias = (year - f )* 365;
        
        System.out.println("Dias: "+dias);
        
        
    }
}