package boletin22;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OrganizarLibreria {
   ArrayList<Libreria> lectura = new ArrayList<Libreria>();
   
public void engadir(Libreria l){
    lectura.add(l);
}
public void visualizar(){
    for(int i=0;i<lectura.size();i++){
        JOptionPane.showMessageDialog(null,lectura.get(i));
    }
}
   public void consultar(){
       
   }
}