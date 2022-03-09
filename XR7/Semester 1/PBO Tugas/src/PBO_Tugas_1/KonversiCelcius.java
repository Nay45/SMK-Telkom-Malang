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
public class KonversiCelcius {
    static void hitung (double c){
        double R, F, K;
        R = 4*c/5;
        F = (9*c/5) + 32;
        K = (5*c/5) + 273.15;
        System.out.println("Reamur : " + R);
        System.out.println("Fareinheit : " + F);
        System.out.println("Kelvin : " + K);
    }
    public static void main(String[] args){
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan suhu (°C) : ");
        double c = masuk.nextInt();
        
        System.out.println();
        hitung(c);
    }
}
