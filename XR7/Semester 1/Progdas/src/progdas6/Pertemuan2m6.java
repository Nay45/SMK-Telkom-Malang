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
public class Pertemuan2m6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai anda : ");
        int nilai=input.nextInt();
        
        if (nilai>=90){
            System.out.print("nilai anda "+nilai);
            System.out.println(" mendapat predikat A");
        }
        else if (nilai>=80){
            System.out.print("nilai anda "+nilai);
            System.out.println(" mendapat predikat B");
        }
        else if (nilai >= 75){
            System.out.print("nilai anda "+ nilai);
            System.out.println(" mendapat predikat C");
        }
        else if (nilai>=60){
            System.out.print("nilai anda "+nilai);
            System.out.println(" mendapat predikat D");
        }
        else {
            System.out.print("nilai anda "+nilai);
            System.out.println(" mendapat predikat E");
        }

    }
}
