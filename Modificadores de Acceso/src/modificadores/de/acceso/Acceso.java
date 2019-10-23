
package modificadores.de.acceso;
public class Acceso {

            public String username= "Husney";
            private String password = "";
            
            //1 OVERCHARGE OF CONSTRUCTOR 
            
            public Acceso(){
                this.username= "";
                this.password= "";
            }
            
            // OVERCHARGE CONSTRUCTOR
            
            public Acceso(String username){
                
                this.username= username;
            
            }
            
            //CONSTRUCTOR   
            
            public Acceso(String username, String password){
                this. username = username;
                this. password = password;
            }
            
            //SETTER SET PASSWORD
            
            public void setpassword(String password){
                this.password = password;
            }
            
            //GETTER GET PASSWORD
            
            public String getpassword(){
                return this.password;
            }
            
            
            
            
            
            
            
            
}
