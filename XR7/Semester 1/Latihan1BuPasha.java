/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanProgdas8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Latihan1BuPasha {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String data[][] = {
            {" "},
            {"Raihan","90","Sangat baik"},
            {"Nuevalen","90","Sangat baik"},
            {"Shevia","85","Baik"},
            {"Zhidan","75","Cukup"},
            {"Oryza","80","Baik"}
                
        };
        
        System.out.print("Masukkan pilihan anda : ");
        int pilihan = input.nextInt();
//        String pilihan = input.nextLine(); (input kalimat/kata2/String)
//        double angka = input.nextDouble(); (input bilangan koma)
        
        if (pilihan >=1 && pilihan <=4){
            System.out.println("================");
            System.out.println("1. Nama : " + data[pilihan][0]);
            System.out.println("2. Nilai : " + data[pilihan][1]);
            System.out.println("3. Keterangan : " + data[pilihan][2]);
            System.out.println("================");
        }else {
            System.out.println("Data tidak ditemukan");
        }
    }
}