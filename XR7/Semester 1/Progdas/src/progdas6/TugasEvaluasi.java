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
public class TugasEvaluasi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai anda : ");
        int nilai = input.nextInt();
        String p = "Nilai tidak valid";
        
        if (nilai>=96 && nilai<=100){
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat A");
           
        }
        
        else if (nilai>=91 && nilai<=95) {
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat A-");
            
        }
        
        else if (nilai>=86 && nilai<=90) {
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat B+");
            
        }
        
        else if (nilai>=81 && nilai<=85) {
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat B");
            
        }
        
        else if (nilai>=75 && nilai<=80) {
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat B-");
            
        }
        
        else if (nilai>=70 && nilai<=74) {
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat C+");
            
        }
        
        else if (nilai>=65 && nilai<=69) {
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat C");
             
        }
        
        else if (nilai>=60 && nilai<=64) {
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat C-");
            
        }
        
        else if (nilai>=55 && nilai<=59) {
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat D+");
            
        }
        
        else if (nilai>=0 && nilai<=54){
            System.out.println("Nilai anda "+nilai);
            System.out.println("Mendapat predikat D");
            
        }
        
        else {
            System.out.println(p);
            System.exit(0);
        }
        
        System.out.print("Masukkan predikat yang anda dapatkan : ");
        String pilihan = input.next();
        
        switch (pilihan) {
            case "A":
                System.out.println("Kriteria sangat baik");
                break;
            case "A-":
                System.out.println("Kriteria sangat baik");
                break;
            case "B+":
                System.out.println("Kriteria baik");
                break;
            case "B":
                System.out.println("Kriteria baik");
                break;
            case "B-":
                System.out.println("Kriteria baik");
                break;
            case "C+":
                System.out.println("Kriteria cukup");
                break;
            case "C":
                System.out.println("Kriteria cukup");
                break;
            case "C-":
                System.out.println("Kriteria cukup");
                break;
            case "D+":
                System.out.println("Kriteria kurang");
                break;
            case "D":
                System.out.println("Kriteria kurang");
                break;
            default:
                System.out.println("Predikat tidak teridentifikasi, mohon gunakan huruf kapital");
        }
    }
}