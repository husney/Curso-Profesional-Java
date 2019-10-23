
package modificadores.de.acceso;


import javax.swing.JOptionPane;

public class ModificadoresDeAcceso {
    

    public static void main(String[] args) {
    
     Acceso cuenta = new Acceso("Husney", "contraseña.1234");
     
     
    
     
     String contraseña= JOptionPane.showInputDialog("Quieres cambiar la contraseña?");
    
     if (contraseña.equalsIgnoreCase("Si")){
         cuenta.setpassword(JOptionPane.showInputDialog("Ingrese la nueva contraseña"));
     }
     
     String mostrar = JOptionPane.showInputDialog("Quiere ver su contraseña?");
     
     if  (mostrar.equalsIgnoreCase("si")){
        System.out.println("Contraseña: "+cuenta.getpassword());
     }
     
     //System.out.println("Username: "+cuenta.username);
     
        
        
        
        
        
        
        
        
        
        
    }
    
}
