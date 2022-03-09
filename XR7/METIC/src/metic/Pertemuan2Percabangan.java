/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metic;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pertemuan2Percabangan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pilihan = 0;
        int angka = 0;
        
        System.out.print("masukkan pilihan anda : ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.println("Menghitung luas persegi");
//                double panjang, lebar, luas;
                
                System.out.println("masukkan panjang : ");
int panjang = input.nextInt();
                System.out.println("masukkan lebar : ");
int lebar = input.nextInt();
int luas = panjang*lebar;
                System.out.println("Luas persegi = " +luas);
                
                break;
            case 2:
                System.out.println("Mengecek ganjil genap");
                
                System.out.print("masukkan bilangan anda : ");
                angka = input.nextInt();
                if(angka%2==0){
                    System.out.println("bilangan genap");
                }else{
                    System.out.println("bilangan ganjil");
                }
                break;
            default:
                System.out.println("default");
        }
    }
}
