package t1;

import javax.swing.JOptionPane;
        
public class T1 {

    public static void main(String[] args) {
        
    Triangulo a = new Triangulo();
    
    int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
    int altura= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));

    int resultado =a.area(base, altura);
    System.out.println("El area del triangulo es:"+resultado);
    
    
    
    }
    
}
