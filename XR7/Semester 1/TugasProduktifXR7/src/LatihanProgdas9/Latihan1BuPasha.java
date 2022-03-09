/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanProgdas9;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Latihan1BuPasha {
    public static void pembagian(int a, int b){
        System.out.println("Hasil dari " + a + " / " + b + " = " + (a/b));
    }
    
     public static void perkalian(int a, int b){
        System.out.println("Hasil dari " + a + " × " + b + " = " + (a*b));
    }
        
     public static void penjumlahan(int a, int b){
        System.out.println("Hasil dari " + a + " + " + b + " = " + (a+b));
    }
            
     public static void pengurangan(int a, int b){
        System.out.println("Hasil dari " + a + " - " + b + " = " + (a-b));
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan 1 : ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan 2 : ");
        int bil2 = input.nextInt();
        
        perkalian(bil1, bil2);
        pembagian(bil1, bil2);
        penjumlahan(bil1, bil2);
        pengurangan(bil1, bil2);
    }
//    public static int jumlah(int a, int b) {
//        int hasil = a + b;
//        return hasil;
//    }
//    
//    public static int kurang(int a, int b) {
//        int hasil = a - b;
//        return hasil;
//    }
//    
//    public static int kali(int a, int b) {
//        int hasil = a * b;
//        return hasil;
//    }
//    
//    public static double bagi(double a, double b) {
//        double hasil = a / b;
//        return hasil;
//    }
//    
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Angka 1 : ");
//        int a = input.nextInt();
//        System.out.print("Angka 2 : ");
//        int b = input.nextInt();
//        
//        Scanner input2 = new Scanner(System.in);
//        System.out.print("Masukkan operator ( + - / * ): ");
//        String operator = input2.nextLine();
//        
//        switch(operator) {
//            case "+" : 
//                System.out.println("Hasil dari " + a + " " + operator + " " + b + " = " + jumlah(a, b));
//            break;
//            case "-" : 
//                System.out.println("Hasil dari " + a + " " + operator + " " + b + " = " + kurang(a, b));
//            break;
//            case "*" : 
//                System.out.println("Hasil dari " + a + " " + operator + " " + b + " = " + kali(a, b));
//            break;
//            case "/" : 
//                System.out.println("Hasil dari " + a + " " + operator + " " + b + " = " + bagi(a, b));
//            break; 
//            default : 
//                System.out.println("Operator tidak sesuai");
//            break; 
//        }
//    }
}
