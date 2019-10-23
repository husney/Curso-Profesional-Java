
package c6;
public class C6 {
    public static void main(String[] args) {

           
        int x = 0;
        int y = 1;
        int z = 1;
        
        for (int i = 1; i<=10;i++){
            
            z=x+y;
            x=y;
            y=z;
            
                /*    
            z=x+y; |1=0+1  |z=1     |z=3 |z=5   |z=8
            x=y;   |1=1    |x=1     |x=2 |x=3   |x=5
            y=z;   |1=1    |y=2     |y=3 |y=5   |y=8
                */
            System.out.println(y);
            
        }
        























    }
    
}
