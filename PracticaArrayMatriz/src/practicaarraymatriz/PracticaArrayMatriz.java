
package practicaarraymatriz;

import java.util.Scanner;

public class PracticaArrayMatriz {

    
    public static void main(String[] args) {
        
//        
//       Persona pers[] = new Persona [5];
//        
//       pers[0] = new Persona("Valentina","Marin");
//       pers[1] = new Persona("Natalia", "Torres");
//       pers[2] = new Persona("Husney");
//       pers[3] = new Persona("Gabriela");
//       pers[4] = new Persona("Stefany");
//    
//       
//       Persona p1 = pers[0];
//       Persona p2 = pers[1];
//       Persona p3 = pers[2];
//       Persona p4 = pers[3];
//       Persona p5 = pers[4];
//       
//       
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        
//        
//        System.out.println(Persona.contadorPersonas);

//
//
//        Persona per[][]= new Persona [2][3];
//        
//        per[0][0] = new Persona("Valentina","Marin");
//        
//        per[0][1] = new Persona("Natalia","Torres");
//        
//        per[0][2] = new Persona("Stefany");
//        
//        per[1][0] = new Persona("Gabriela");
//        
//        per[1][1] = new Persona("Adele");
//        
//        per[1][2] = new Persona("Selena","Gomez");
//        
        
//        for(int i = 0 ;i<per.length;i++){
//            for(int j = 0 ; j<per[i].length; j++){
//                
//            
//            System.out.println(per[i][j]);
//            }
//        }
    
//    int i = 0;
//    int j = 0;
//    
//    while(i<per.length){
//        j
//        while(j<per[i].length){
//            System.out.println(per[i][j]);
//        j++;
//        }
//        i++;
//    }
//    
//    Persona p1 = per[0][1];
//    
//        System.out.println(p1);
//   
//    
//        System.out.println(Persona.contadorPersonas);
//    
    
    
//        int n[][]= new int [5][5];
//        
//        
//        for(int i = 0; i<n.length; i++){
//            for(int j = 0 ; j<n[i].length;j++){
//                n[i][j]= (int)(Math.random()*100);
//            }
//        }
//    ***********************************************************
//       for(int i = 0 ; i<n.length; i++){
//           for(int j = 0 ;j<n[i].length; j++){
//               System.out.print(n[i][j]+" ");
//              
//           } System.out.println("");
//       }
//                int n[][]= new int[5][2];
//                   
//                for(int i = 0; i<n.length; i++){
//                    for(int j= 0; j<n[i].length;j++){
//                       n[i][j]=(int)(Math.random()*20);
//                    }
//                }
//         *****************************************************      
//                  FOR EACH PARA ARRAYS
//         *****************************************************
//                for(int[] a :  n){
//                    for(int b: a)
//                    System.out.println(b);
//                }
//    
//    
    
//        int n[][]= new int[5][4];  Imprimer
//
//              System.out.println(n.length); Imrpime renglones
//            System.out.println(n[0].length); Imprimer columnas

//
//        Scanner sc = new Scanner(System.in);
//        
//        int n = sc.nextInt();
//        int res = 0;
//        
//        for(int i =0; i<=10; i++){
//            res= n*i;
//            System.out.println(n+ "x "+i + " = "+ res);
//        }
       
//        String a[][]= new String[3][2];
//        
//        a[0][0]= "a";
//        a[0][1]= "b";
//        
//        a[1][0]= "c";
//        a[1][1]= "d";
//        
//        a[2][0]= "f";
//        a[2][1]= "g";
//        
//        for(int i = 0 ;i < a.length; i++){
//            for(int j=0; j< a[i].length;j++){
//                System.out.println(a[i][j]);
//            }
//        }
//        
//        System.out.println(a.length);
//        
//        System.out.println(a[0].length);


//            int m[][]= new int[5][4];
//            
//            m[0][0]=1;
//            m[0][1]=2;
//            m[0][2]=3;
//            m[0][3]=4;
//
//            m[1][0]=8;
//            m[1][1]=7;
//            m[1][2]=6;
//            m[1][3]=5;
//            
//            m[2][0]=9;
//            m[2][1]=11;
//            m[2][2]=22;
//            m[2][3]=13;
//            
//            m[3][0]=17;
//            m[3][1]=35;
//            m[3][2]=16;
//            m[3][3]=67;
//            
//            m[4][0]=19;
//            m[4][1]=20;
//            m[4][2]=21;
//            m[4][3]=22;
//            
//            System.out.println(m[4][2]);

        Persona per[][]= new Persona[2][4];

//        
         per[0][0]=new Persona("Valentina","Marin");
         per[0][1]=new Persona("Natalia","Torres");
         per[0][2]=new Persona("Selena","Gomez");
         per[0][3]=new Persona("Adele");
         per[1][0]=new Persona("Stefany");
         per[1][1]=new Persona("Dareni");
         per[1][2]=new Persona("Luyah");
         per[1][3]=new Persona("Laura");
         
     
         
//         for(int i = 0;i<per.length; i++){
//             for(int j = 0; j<per[i].length; j++){
//                 System.out.println(per[i][j]);
//             }
//         }
         
         
//    int i = 0;
//    
//    while(i<per.length){
//       int j=0;
//        while(j<per[i].length){
//            System.out.println(per[i][j]);
//        j++;
//        }i++;
//    }
//         

         int n[][]= new int[5][3];
         
         for(int i = 0; i<n.length; i++){
             for(int j = 0 ; j<n[i].length; j++){
                 n[i][j]=(int)(Math.random()*50);
             }
         }
         
         
         
        }//main   
    
}
