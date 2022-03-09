/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pertemuan4m6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        
        if (nilai>=90){
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat A");
            if(nilai==100){
                System.out.println("Sempurna");
            }
        }
        else if (nilai>=80){
            System.out.println("Nilai anda "+nilai);
            System.out.print("Mendapat predikat B");
            if(nilai >=89){
                System.out.println(", sedikit lagi dapat nilai A");
            }
        }
        else if (nilai>=75){
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat C");
        }
        else if (nilai>=60){
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat D");
        }
        else {
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat E");
            if (nilai<60){
                System.out.println("Tidak lulus");
            }
    }
}
}
