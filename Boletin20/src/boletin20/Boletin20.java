/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_20;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais 1997
 */
public class Boletin_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libreria libr = new Libreria();
        libr.engadirLibro(new Libro("Mamá", "Bobi", "C3", 23, 24));
        libr.engadirLibro(new Libro("Pei", "Seco", "yt67", 12, 1));
        libr.engadirLibro(new Libro("Te lo juro", "Isi", "adsf", 10, 79));
         boolean condicion = true;
        do {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Elixe opción:\n1)Engadir \n2)Amosar\n3)Borrar\n4)Vender Libro\n5)Consultar\n6)Sair"));
            switch (menu) {
                case 1:
                    libr.engadirLibro(new Libro(JOptionPane.showInputDialog("Titulo"), JOptionPane.showInputDialog("Autor"), JOptionPane.showInputDialog("ISBN"), Double.valueOf(JOptionPane.showInputDialog("Precio")), Integer.valueOf(JOptionPane.showInputDialog("Unidades"))));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,libr.amosar());
                    break;
                case 3:
                    libr.borrar();
                    break;
                case 4: libr.vender();
                    break;
                case 5:libr.Consultar();
                    break;
                case 6: System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Numero incorrecto");

            }

        } while(true);
    
    }
}
Status API Training Shop Blog About Pricing
© 2016 GitHub, Inc. Terms P