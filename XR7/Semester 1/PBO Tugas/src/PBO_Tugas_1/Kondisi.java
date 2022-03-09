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
public class Kondisi {
    public static void main (String[] args){
        
        Scanner masuk = new Scanner (System.in);
        int nilai;
        System.out.print("Masukkan nilai akhir PBO : ");
        nilai = masuk.nextInt();
        if (nilai<70){
            System.out.println("Siswa tidak lulus");
        }if (nilai>70){
            System.out.println("Siswa lulus");
        }
    }
}
