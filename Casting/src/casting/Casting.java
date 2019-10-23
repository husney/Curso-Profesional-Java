/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author usney
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado;
        
        empleado = new Escritor("Roy",1500,TipoEscritura.CLASICA);
        
        imprimirDetalles(empleado);
            
        empleado = new Gerente("Larua",1800,"Sistemas");
        
        imprimirDetalles(empleado);
                
    
    
    }
    

        private static void imprimirDetalles(Empleado empleado){
            
            String resultado  = null;
            
            System.out.println("\nDetalle: \n"+empleado.toString());
            
            if(empleado instanceof Escritor){
                
                
                resultado = ((Escritor)empleado).getTipoEscrituraTexto();
                System.out.println("Tipo de Escritura: "+resultado );
            }
            else if (empleado instanceof Gerente){
                resultado = ((Gerente)empleado).getDepartamento();
                System.out.println("Departamento: "+resultado);
            }
        }
}
