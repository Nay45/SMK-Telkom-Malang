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
public class LatihanUKL {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String ID [][] = {
            {},
            {"1", "MIRA", "SBMPTN", "SAWOJAJAR"},
            {"2", "NINA", "SNMPTN", "KEDUNG KANDANG"},
            {"3", "OEMAR", "MANDIRI", "IJEN"},
            {"4", "PENA", "SBMPTN", "DINOYO"}
        };
        
//        String bayar [][] = {
//            {},
//            {"SBMPTN", "A", "5", "0.5"},  
//            {"SBMPTN", "B","15", "1"},  
//            {"SBMPTN", "C","30", "2"},  
//            {"SNMPTN", "A", "7", "0.5"},  
//            {"SNMPTN", "B", "17", "1"},  
//            {"SNMPTN", "C", "35", "2"},  
//            {"MANDIRI", "A", "10", "1"},  
//            {"MANDIRI", "B", "25", "2"},  
//            {"MANDIRI", "C", "50", "3"}, 
//       };
        
        System.out.print("Masukkan id : ");
        String id = input.next();
        System.out.print("Pendapatan orangtua (juta) : ");
        String ortu = input.next();
        System.out.print("Jumlah bulan SPP : ");
        String spp = input.next();
        System.out.println("=============================\n");
        for (int i=1; i<ID.length; i++){
        if (id.equalsIgnoreCase(ID[i][0])){
                System.out.println("Mahasiswa : " + ID[i][0] + ", " + ID[i][1] + ", " + ID[i][2] + ", " +  ID[i][3]);
            }
        }
        
        int ortu1 = Integer.parseInt(ortu);
        if (ortu1 <=2){
            System.out.println("Kategori pendapatan : A");
        }else if (ortu1 > 2 && ortu1 <=10){
            System.out.println("Kategori pendapatan : B");
        }else if (ortu1 > 10){
            System.out.println("Kategori pendapatan : C");
        }
        double spp1 = Double.parseDouble(spp);
//        for (int i=1; i<ID.length; i++){
//        if (ID[i][2].equalsIgnoreCase("SBMPTN") && ortu1 <=2){
//            double total = 0.5 * spp1;
//            System.out.println("Biaya : " + total);
//            break;
//        }else if (ID[i][2].equalsIgnoreCase("SBMPTN") && ortu1 > 2 && ortu1 <=10){
//            double total = 1 * spp1;
//            System.out.println("Biaya : " + total);
//            break;
//        }else if (ID[i][2].equalsIgnoreCase("SBMPTN") && ortu1 > 10){
//            double total = 2 * spp1;
//            System.out.println("Biaya : " + total);
//            break;
//        }else if (ID[i][2].equalsIgnoreCase("SNMPTN") && ortu1 <=2){
//            double total = 2 * spp1;
//            System.out.println("Biaya : " + total);
//            break;
//        }
//    }
        int id1 = Integer.parseInt(id);
        if (id1 == 1 || id1 == 4 && ortu1 <=2){
            double total = 0.5 * spp1;
            System.out.println("Biaya : " + total);
         }
        else if(id1 == 1 || id1 == 4 && ortu1 >2 && ortu1 <=10){
            double total = 1 * spp1;
            System.out.println("Biaya : " + total);
         }
         else if(id1 == 1 || id1 == 4 && ortu1 >10){
            double total = 2 * spp1;
            System.out.println("Biaya : " + total);
         }
         else if(id1 == 2 && ortu1 <=2){
            double total = 0.5 * spp1;
            System.out.println("Biaya : " + total);
         }
         else if(id1 == 2 && ortu1 >2 && ortu1 <=10){
            double total = 1 * spp1;
            System.out.println("Biaya : " + total);
         }
         else if(id1 == 2 && ortu1 >10){
            double total = 2 * spp1;
            System.out.println("Biaya : " + total);
         }
}
}