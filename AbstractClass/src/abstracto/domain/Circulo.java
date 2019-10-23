/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto.domain;

/**
 *
 * @author usney
 */
public class Circulo extends FiguraGeometrica {
    
    public Circulo(){
        super("Circulo default");
    }
    
    @Override
    public void dibujar(){
        System.out.println("-Tipo figura desde metodo metodo abstracto :"+this.getClass().getSimpleName());
    }
    
    
    
    
}
