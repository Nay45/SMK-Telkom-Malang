/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challanges;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class KalkulatorSederhana {
    public static int jumlah(int a, int b) {
        int hasil = a + b;
        return hasil;
    }
    
    public static int kurang(int a, int b) {
        int hasil = a - b;
        return hasil;
    }
    
    public static int kali(int a, int b) {
        int hasil = a * b;
        return hasil;
    }
    
    public static double bagi(int a, int b) {
        int hasil = a / b;
        return hasil;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String jawab;
        
        do{
        System.out.println("\nKalkulator Sederhana");
        System.out.println("================");
        System.out.print("Angka 1 : ");
        int angka1 = input.nextInt();
        System.out.print("Angka 2 : ");
        int angka2 = input.nextInt();
        System.out.print("Metode mengitung (+ - / *) : ");
        String n = input.next();
        System.out.println("================");
        
        switch (n){
            case "+" : 
                System.out.println("Hasil dari " + angka1 + " " + n + " " + angka2 + " = " + jumlah(angka1, angka2));
            break;
            case "-" : 
                System.out.println("Hasil dari " + angka1 + " " + n + " " + angka2 + " = " + kurang(angka1, angka2));
            break;
            case "*" : 
                System.out.println("Hasil dari " + angka1 + " " + n + " " + angka2 + " = " + kali(angka1, angka2));
            break;
            case "/" : 
                System.out.println("Hasil dari " + angka1 + " " + n + " " + angka2 + " = " + bagi(angka1, angka2));
            break; 
            default : 
                System.out.println("Operator tidak sesuai");
            break; 
        }
        
        System.out.print("Ulangi ? (Y/T) : ");
        jawab = input.next();
    
        }while(jawab.equalsIgnoreCase("Y"));
    }
}
