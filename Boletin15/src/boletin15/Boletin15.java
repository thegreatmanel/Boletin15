/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author Brais
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Xogador ramon = new Xogador(8,"pichichi");
        Masaxista masx = new Masaxista("huesólogo",4);
        Seleccion xogador = new Seleccion();
        Adestrador adest = new Adestrador("55987P");
        ramon.concentrarse();
        masx.concentrarse();
        xogador.concentrarse();
        adest.concentrarse();
        ramon.viaxar();
        masx.viaxar();
        adest.viaxar();
    }
    
}