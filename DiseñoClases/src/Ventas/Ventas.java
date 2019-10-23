
package Ventas;

import diseñoclases.*;
public class Ventas {
    
    public static void main(String[] args) {
        
        Producto p1 = new Producto("Camisa",50);
        Producto p2 = new Producto("Pantalon", 100);
        
        Orden o1 = new Orden();
        
        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        
        
        o1.mostrarOrden();
    }
}
