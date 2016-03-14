/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin18.pkg2;

/**
 *
 * @author nlopezjimenez
 */
public class Boletin18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx= new Metodos();
        obx.CargarArray();
        obx.pedirNota();
        obx.aprobadosSuspensos();
        obx.notaAlta();
        obx.NotaMedia();
    }
    
}