
package a1;


public class A1 {

   
    public static void main(String[] args) {
    
        String m [][] = new String [4][3];
        
        m [0][0]="1 x= 0 y= 0";
        m [0][1]="2 x= 0 y= 1";
        m [0][2]="3 x= 0 y=2";
        
        m [1][0]="4 x= 1 y= 0";
        m [1][1]="5 x= 1 y= 1";
        m [1][2]="6 x= 1 y= 2";
        
        m [2][0]="7 x= 2 y=0";
        m [2][1]="8 x= 2 y=1";
        m [2][2]="9 x= 2 y=2";
        
        m [3][0]="10 x= 3 y= 0";
        m [3][1]="11 x= 3 y= 1";
        m [3][2]="12 x= 3 y= 2";
    
    
//            for(int x = 0; x<m.length ;x++){
//                
//                for(int y = 0; y<m[x].length;y++){
//                    System.out.println(m[x][y]);
//                }
//            }
//    
     
    
    String f [] = new String[3];
    
    f [0]="a";
    f [1]="b";
    f [2]="c";
    
    for(String k :f){
        System.out.println(k);
    }
    
    }
    
}
