/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_Tugas_1;

/**
 *
 * @author USER
 */
public class LuasBalok {
    public static void main (String[] args){
        int p = 5;
        int l = 10;
        int t = 5;
        System.out.println("Nilai panjang balok : " + p);
        System.out.println("Nilai lebar balok : " + l);
        System.out.println("Nilai tinggi balok : " + t);
        System.out.println("===============================");
        System.out.println("Menghitung luas permukaan balok");
        System.out.println("===============================");
        System.out.println("Luas permukaan balok : " + ((2*p*l) + (2*p*t) + (2*l*t)));
    }
}
