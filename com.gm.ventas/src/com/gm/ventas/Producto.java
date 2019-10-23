
package com.gm.ventas;

public class Producto {
    
     private int idProducto;
     private String nombre;
     private double precio;
     private static int contadorProductos;
     
     
     private Producto(){
         this.idProducto = ++contadorProductos;
     }

     public Producto(String nombre, double precio){
         this();
         this.nombre = nombre;
         this.precio= precio;
         
     }

        public int getIdProducto(){
            return idProducto;
        }
        
        public void setProducto(int idProducto){
            this.idProducto = idProducto;
        }
        
        public String getNombre(){
            return this.nombre;
        }
    
        
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public double getPrecio(){
            return precio;
        }
        
        
        public void setPrecio(double precio){
            this.precio = precio;
        }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
        
        

}

