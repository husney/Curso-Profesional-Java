
package formas;
public class Cubo {

    int alto;
    int ancho;
    int profundo;
     
    
    // alto * ancho * profundo;

    Cubo( ){
        
    }
    
    Cubo (int alto, int ancho, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int calcularvolumen(){
        return alto * ancho *profundo;
    }
    

    public int cambiarvalor(int i ){
        return i = 200;
    }

  









}
