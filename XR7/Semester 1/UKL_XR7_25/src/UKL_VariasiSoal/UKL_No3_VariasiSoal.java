/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL_VariasiSoal;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class UKL_No3_VariasiSoal {
//    static int hitung(int idMasuk , int idKeluar , int golongan) {
//        int bayar = 0;
//        
//        int golonganSatu[]={5000,6000,9000,6000,5500,5500,9000,6000,3000};
//        int golonganDua[]={8000,9000,14000,9000,8500,8500,14000,8500,5000};
//        int golonganTiga[]={8000,9000,14000,9000,8500,8500,14000,8500,5000};
//        
//        if(golongan == 1){
//            bayar = golonganSatu[idMasuk - 1] + golonganSatu[idKeluar - 1];
//        } else if (golongan == 2){
//            bayar = golonganDua[idMasuk - 1] + golonganDua[idKeluar - 1];
//        } else{
//            bayar = golonganTiga[idMasuk - 1] + golonganTiga[idKeluar - 1];
//        }
//        
//        return bayar;
//    }
//
//    public static void main(String[] args) {
//        int id[]={1,2,3,4,5,6,7,8,9};//id
//        String ruas[]={"Dupak - Waru", "Waru - Sidoarjo", "Waru - Porong", "Sidoarjo - Waru", "Sidoarjo - Porong","Porong - Sidoarjo","Porong-Waru","Porong - Kejapanan","Kejapanan - Gempol"};//ruas
//        
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Masukkan id masuk");
//        String idIn = myObj.nextLine();
//        int iId=Integer.valueOf(idIn);
//        
//        Scanner myObja = new Scanner(System.in);
//        System.out.println("Masukkan id keluar");
//        String idOut = myObja.nextLine();
//        int iIdOut=Integer.valueOf(idOut);
//        
//        Scanner myObjb = new Scanner(System.in);
//        System.out.println("Masukkan golongan kendaraan");
//        String idGolongan = myObjb.nextLine();
//        int iIdGolongan = Integer.valueOf(idGolongan);
//        
//        int totalbayar =  hitung(iId , iIdOut , iIdGolongan);
//        
//        System.out.println("Print Out Tagihan");
//        System.out.println("Jalur Masuk\t:" + ruas[iId-1]);
//        System.out.println("Jalur Keluar\t:" + ruas[iIdOut-1]);
//        System.out.println("Golongan\t:" + iIdGolongan);
//        System.out.println("Biaya\t:Rp." + totalbayar+",-");

    public static void main(String[] args) {
        int id[]={1,2,3,4,5,6,7,8,9};//id
        String ruas[]={"Dupak - Waru", "Waru - Sidoarjo", "Waru - Porong", "Sidoarjo - Waru", "Sidoarjo - Porong","Porong - Sidoarjo","Porong-Waru","Porong - Kejapanan","Kejapanan - Gempol"};//ruas
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan id masuk");
        String idIn = myObj.nextLine();
        int iId=Integer.valueOf(idIn);
        
        Scanner myObja = new Scanner(System.in);
        System.out.println("Masukkan id keluar");
        String idOut = myObja.nextLine();
        int iIdOut=Integer.valueOf(idOut);
        
        Scanner myObjb = new Scanner(System.in);
        System.out.println("Masukkan golongan kendaraan");
        String idGolongan = myObjb.nextLine();
        int iIdGolongan = Integer.valueOf(idGolongan);

        int bayar = 0;
        
        int golonganSatu[]={5000,6000,9000,6000,5500,5500,9000,6000,3000};
        int golonganDua[]={8000,9000,14000,9000,8500,8500,14000,8500,5000};
        int golonganTiga[]={8000,9000,14000,9000,8500,8500,14000,8500,5000};
        
        if(iIdGolongan == 1){
            bayar = golonganSatu[iId - 1] + golonganSatu[iIdOut - 1];
        } else if (iIdGolongan == 2){
            bayar = golonganDua[iId - 1] + golonganDua[iIdOut - 1];
        } else{
            bayar = golonganTiga[iId - 1] + golonganTiga[iIdOut - 1];
        }
        
        System.out.println("Print Out Tagihan");
        System.out.println("Jalur Masuk\t:" + ruas[iId-1]);
        System.out.println("Jalur Keluar\t:" + ruas[iIdOut-1]);
        System.out.println("Golongan\t:" + iIdGolongan);
        System.out.println("Biaya\t:Rp." + bayar+",-");
	}
}