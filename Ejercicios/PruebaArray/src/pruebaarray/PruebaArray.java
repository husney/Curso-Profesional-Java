
package pruebaarray;

public class PruebaArray {


    public static void main(String[] args) {

//        int a[] = new int [5];
//
//        a[0]=120;
//        a[1]= 245;
//        a[2]= 1234;
//        a[3]= 123154;
//        a[4]= 15;
//        
//        for(int i = 0 ; i<a.length; i++){
//            System.out.println("Arrai pos "+(i+1)+ " ="+a[i]);
//        }
//  
//        Persona per[] = new Persona[6];
//    
//        per[0]= new Persona("Valentina", "Marin");
//        per[1]= new Persona("Natalia", "Rodriguez");
//        per[2]= new Persona("Husney");
//        per[3]= new Persona("Stefany");
//        per[4]= new Persona("Adele");
//        per[5]= new Persona("Selena","Gomez");
//       
//        for(int i = 0 ; i<per.length;i++){
//            System.out.println(per[i]);
//        }
//        int i = 0;
//        Persona []per ={new Persona("Valentina","Marin"),new Persona("Natalia", "Rodriguez"),new Persona("Husney"), new Persona("Stefany"),new Persona("Adele"), new Persona("Selena","Gomez")};
//        
////        for(int i = 0 ; i<per.length;i++){
////            System.out.println(per[i]);
////        }
////        while(i<per.length){
////            System.out.println(per[i]);
////            i++;
////        }
//        
//        do{ System.out.println(per[i]);
//        i++;
//        Persona p3= per[2];
//        Persona p4= per[3];
//        }while(i<per.length);
//        
//        Persona p1= per[0];
//        Persona p2= per[1];
//        Persona p3= per[2];
//        Persona p4= per[3];
        
    Persona a[][]= new Persona [3][2];
        
    a[0][0]= new Persona("Valentina","Marin");
    a[0][1]= new Persona("Natalia","Rodriguez");

    a[1][0]= new Persona("Stefany");
    a[1][1]= new Persona("Husney");
    
    a[2][0]= new Persona("Adele");
    a[2][1]= new Persona("Selena","Gomez");



    System.out.println(a[5][2]);
    
    
    
    
    
    
    
    
    
    
    }//main
    
}
