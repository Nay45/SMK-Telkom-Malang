/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UjiCoba;

/**
 *
 * @author USER
 */
public class MobilA {
        public static void main(String[] args) {
        // TODO code application logic here
        //membuat objek
        Mobil mobil1 = new Mobil();
        mobil1.mogok();
        
        Mobil mobil2 = new Mobil("Pertamax", 6, 100);
        mobil2.berjalan();
    }
}
