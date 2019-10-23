package encapsulamiento;


public class Persona {

       private String nombre;
       private String apellido;
       private boolean borrado;
        
        public Persona ( String nombre, String apellido, boolean borrado){
            this.nombre = nombre;
            this.apellido = apellido;
            this.borrado = borrado;
        }
        public String getNombre(){
            return nombre;
        }
        
        public void setNombre (String nombre){
            this.nombre = nombre;
        }
        
        public String getApellido(){
            return apellido;
        }
        
        public void setApellido(String apelido){
            this.apellido = apellido;
        }
        
        public boolean isborrado(){
            return this.borrado;
        }
        
        public void setBorrado(boolean borrado){
            this.borrado = borrado;
        }
        
        public String toString(){
            return "Nombre: "+nombre + " Apellido: "+ apellido +" borrado"+borrado;
        }
        
}
