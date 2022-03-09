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
public class Inputan {
    public static void main (String[] args){
        Scanner masuk = new Scanner (System.in);
        int a, b;
        System.out.print("Masukkan nilai a : ");
        a = masuk.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = masuk.nextInt();
        System.out.println("");
        System.out.println("Nilai variable yang ada pada program : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
