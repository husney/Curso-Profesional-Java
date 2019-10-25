/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import exepciones.AccesoDatosEx;

/**
 *
 * @author usney
 */
public interface Datos {
    
    
    
    public abstract void insertar() throws AccesoDatosEx;
    
    public abstract void listar() throws AccesoDatosEx;
    
    public abstract void simularError(boolean simularError);
    
}
