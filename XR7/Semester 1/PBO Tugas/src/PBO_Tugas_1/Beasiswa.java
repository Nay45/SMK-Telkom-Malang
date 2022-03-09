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
public class Beasiswa {
    public static void main (String[] args){
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan nilai TPA : ");
        int TPA = masuk.nextInt();
        System.out.print("Masukkan nilai b.inggris : ");
        int ing = masuk.nextInt();
        if ((TPA > 85) && (ing > 80)){
            System.out.println("Siswa dapat beasiswa");
        }else {
            System.out.println("Siswa tidak dapat beasiswa");
        }
    }
}
