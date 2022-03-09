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
public class Pertemuan1m6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umurmu : ");
        int umur=input.nextInt();
        
        if (umur >= 17) {
            System.out.println("umur anda " +umur);
            System.out.println("memasuki masa dewasa");
        }
        else{
            System.out.println("umur anda " +umur);
            System.out.println("memasuki masa remaja");
        }

    }
}