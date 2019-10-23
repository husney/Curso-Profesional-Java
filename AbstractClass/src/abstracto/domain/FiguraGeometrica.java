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
public abstract class FiguraGeometrica {
    
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    public abstract void dibujar();
    
    public String getTipoFigura(){ 
        return this.tipoFigura;
    }
    
    public void setTipoFigura(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    @Override
    public String toString(){
        return "Tipo Figura: "+this.tipoFigura;
    }
    
}
