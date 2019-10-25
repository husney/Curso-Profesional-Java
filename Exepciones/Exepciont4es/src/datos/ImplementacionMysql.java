/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import exepciones.*;
/**
 *
 * @author usney
 */
public class ImplementacionMysql implements Datos {
    
   private boolean simularError;
   
         @Override
          public void insertar() throws AccesoDatosEx{
            if(simularError){
           throw new EscrituraDatosEx("Error de escritura de datos");
               }else{
           System.out.println("Insertar desde Mysql");
       }    
   }
    
          @Override
          public void listar() throws AccesoDatosEx{
              if(simularError){
                  throw new LecturaDatosEx("Error de lectura de datos");
              }
              else {
                  System.out.println("Listar desde Mysql");
              }
          }
          
          public boolean isSimularError(){
              return this.simularError;
          }
          
          @Override
          public void simularError(boolean simularError){
              this.simularError = simularError;
          }
   

    
}
