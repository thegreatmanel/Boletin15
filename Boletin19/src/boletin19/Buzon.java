/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;

/**
 *
 * @author balva
 */
public class Buzon {

    ArrayList<Correo> emails =new ArrayList<Correo>();
    
    public int numeroDeCorreos(){
        return emails.size();
    }
    public void engade(Correo c){
        emails.add(c);
    }
    public boolean porLeer(){
       
        for(Correo c:emails){
            if(!c.lido()){
             return true;  
            }
        }
            return false;      
    } 
        public String primerNoLeido(){
              for(Correo c:emails){
            if(!c.lido()){
             return c.toString();
            }
        }
             return null;       
}
        public String amosa(int k){
          return  emails.get(k).toString();
        }

    void numeroDeCorreos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}