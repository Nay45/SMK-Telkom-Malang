/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_Tugas_1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LuasPermukaanBola {
    public static void main (String[] args){
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan jari-jari bola : ");
        double r = masuk.nextDouble();
        System.out.println("\n==========================");
        System.out.println("Menghitung luas permukaan");
        System.out.println("==========================");
        double phi = 3.14;
        double hasil = 4*phi*r*r;
        System.out.println("Luas permukaan : " + hasil);
    }
}
