/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas9;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MethodDasar {
//    mengembalikan nilai (return type adalah tipe data)
//    public static int penjumlahan (){
//        int hasil = 10+5;
//        return hasil;
//    }
//    tidak mengembalikan nilai (return tupe adalah void)
//    public static void cetak(){
//    }
    
//    public static void cetak (){
//        System.out.println("Kelas XR7");
//    }
//    
//    public static int nilai(){
//        int hasil = 100;
//        return hasil;
//    }
//    
//    public static void main(String[] args) {
//        cetak();
//        System.out.println("Nilai anda : " + nilai());
//    }
    
    public static void hitung(int a, int b){
        System.out.println("Hasil : " + (a+b));
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int bil1, bil2;
        System.out.print("Masukkan bilangan 1 : ");
        bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan 2 : ");
        bil2 = input.nextInt();
        
        hitung(bil1, bil2);
    }
}
