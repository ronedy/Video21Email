
package Video21EmailKev;

import java.util.*;
import javax.swing.JOptionPane;

public class Email {
    
    public void comprobarEmail(){
        
        int arroba = 0; //bandera
    
    boolean punto = false; //otra bandera
    
    String correo = JOptionPane.showInputDialog("Ingresa tu dirección email: ");
    
    for(int i=0; i<correo.length(); i++){
    
        if(correo.charAt(i)=='@'){
            
            arroba++;    //le subo un numero a la arroba para saber si hay
        }
        
        if(correo.charAt(i)=='.'){
            
            punto = true; //si hay algun punto, tambien cumple el true
        }
        
    }
    
    if(arroba == 1 && punto==true){
        
        JOptionPane.showMessageDialog(null,"El email es correcto");
        
    }else{
        
        JOptionPane.showMessageDialog(null,"El email es incorrecto");
    }
    
        
        }
    }

