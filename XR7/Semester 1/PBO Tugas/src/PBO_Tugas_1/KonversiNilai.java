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
public class KonversiNilai {
    public static void main(String[] args){
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan nilai web : ");
        int nilai = masuk.nextInt();
        if (nilai>=90){
            System.out.println("Nilai A");
        }else if (nilai>=75){
            System.out.println("Nilai B");
        }else if (nilai>=50){
            System.out.println("Nilai C");
        }else if (nilai>=35){
            System.out.println("Nilai D");
        }else {
            System.out.println("Nilai E");
        }
    }
}
