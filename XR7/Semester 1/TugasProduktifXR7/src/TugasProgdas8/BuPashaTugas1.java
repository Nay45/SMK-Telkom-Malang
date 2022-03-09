/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProgdas8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BuPashaTugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String data[][] = {
            
            {"  "},
            {"Duku","Rp. 915.000","Rp. 1.025.000","Rp. 1.225.000"},
            {"Jeruk","Rp. 915.000","Rp. 1.025.000","Rp. 1.225.000"},
            {"Alpukat","Rp. 575.000","Rp. 695.000","Rp. 895.000"},
            {"Jambu Air","Rp. 575.000","Rp. 695.000","Rp. 895.000"},
            {"Durian","Rp. 595.000","Rp. 715.000","Rp. 915.000"},
            {"Melon","Rp. 595.000","Rp. 715.000","Rp. 915.000"},
            {"Belimbing","Rp. 495.000","Rp. 575.000","Rp. 755.000"},
            {"Mangga","Rp. 495.000","Rp. 575.000","Rp. 755.000"},
            {"Kedondong","Rp. 495.000","Rp. 575.000","Rp. 755.000"},
            {"Barrack","Rp. 25.000","Rp. 25.000","Rp. 35.000"}
//            note : ruang kosong di awal dibuat agar hitungan data mulai dari 1 bukan 0
        };

        int harga[][] = {
            
            {},
            {1, 915000,1025000,1225000},
            {1, 915000,1025000,1225000},
            {1, 575000,695000,895000},
            {1, 575000,695000,895000},
            {1, 595000,715000,915000},
            {1, 595000,715000,915000},
            {1, 495000,575000,755000},
            {1, 495000,575000,755000},
            {1, 495000,575000,755000},
            {1, 25000,25000,35000}
//            note : 1 = bukan apa2 (agar hitungan data nya sama dengan data yang awal)
        };
        
        System.out.println("Cottage :");
        
        System.out.println("================");
        System.out.println("1. Duku");
        System.out.println("2. Jeruk");
        System.out.println("3. Alpukat");
        System.out.println("4. Jambu Air");
        System.out.println("5. Durian");
        System.out.println("6. Melon");
        System.out.println("7. Belimbing");
        System.out.println("8. Mangga");
        System.out.println("9. Kedondong");
        System.out.println("10. Barrack");
        System.out.println("================");
        
        System.out.print("Pilih cottage : ");
        int pilih1 = input.nextInt();
        
        System.out.println("\nTipe Hari :");
        
        System.out.println("================");
        System.out.println("1. Weekday");
        System.out.println("2. Weekend");
        System.out.println("3. Holiday");
        System.out.println("================");
        
        System.out.print("Pilih Tipe Hari : ");
        int pilih2 = input.nextInt();
        
        System.out.print("\nLama Menginap (hari) : ");
        int pilih3 = input.nextInt();
        System.out.println("================");
        
        if (pilih1 >=1 && pilih1<=10){
            System.out.println("\n================");
            System.out.println("1. Cottage : " + data[pilih1][0]);
        }else {
            System.out.println("Data tidak ditemukan");
            System.exit(0);
        }
        
        if (pilih2>=1 && pilih2<=3){
            System.out.println("2. Harga per malam : " + data[pilih1][pilih2]);
        }else {
            System.out.println("Data tidak ditemukan");
            System.exit(0);
        }
        
        System.out.println("3. Lama menginap : " + pilih3 + " Hari");
        System.out.println("================\n");
        
        int total = pilih3*harga[pilih1][pilih2];
//        int total = pilih3*Double.parseDouble(data[pilih1][pilih2]); (Convert String == Double)

        System.out.println("Harga yang perlu dibayar : " + "Rp. " + total);
    }
}
