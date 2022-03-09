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
public class UKL_No2_VariasiSoal {
    public static void main(String[] args){
        int id[]={1,2,3,4};//id
        String nama[]={"Mira", "Nina", "Oemar", "Pena"};//nama
        String jalurMasuk[]={"SBMPTN","SNMPTN","Mandiri","SBMPTN"};//jalur masuk
        String alamat[]={"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};//alamat
        
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan id mahasiswa : ");
        String idIn = myObj.nextLine();
        int iId=Integer.valueOf(idIn);
        
        System.out.print("Masukkan pendapatan orang tua : ");
        String pendapatan = myObj.nextLine();
        int iPendapatan = Integer.valueOf(pendapatan);
        
        System.out.print("Masukkan jumlah bulan SPP : ");
        String bulan = myObj.nextLine();
        int iBulan = Integer.valueOf(bulan);
	
        String kategoriPendapatan;

         if(iPendapatan < 2000000){
                kategoriPendapatan = "A";
             }else if (iPendapatan >= 2000000 && (iPendapatan <= 10000000 )) {
                kategoriPendapatan = "B";
             }else{
                kategoriPendapatan = "C";
             }

         int bayar = 0;
         String jalur = jalurMasuk[iId-1];
         if (jalur =="SBMPTN"){
             if(kategoriPendapatan == "A"){
                bayar = (iBulan * 500000) + 5000000;
             }else if (kategoriPendapatan == "B") {
                bayar = (iBulan * 1000000) + 15000000;
             }else{

                bayar = (iBulan * 2000000) + 30000000;
             }
         } else if (jalur == "SNMPTN"){
             if(kategoriPendapatan == "A"){
                bayar = (iBulan * 500000) + 7000000;
             }else if (kategoriPendapatan == "B") {
                bayar = (iBulan * 1000000) + 17000000;
             }else{
                bayar = (iBulan * 2000000) + 35000000;
             }
         } else if (jalur == "Mandiri"){
             if(kategoriPendapatan == "A"){
                bayar = (iBulan * 1000000) + 10000000;
             }else if (kategoriPendapatan == "B") {
                bayar = (iBulan* 2000000) + 25000000;
             }else{
                bayar = (iBulan * 3000000) + 50000000;
             }
         }
        
        System.out.println("Print Out Tagihan");
        System.out.println("ID\t:" + idIn);
        System.out.println("Nama\t:" + nama[iId-1]);
        System.out.println("Jalur Masuk\t:" + jalur);
        System.out.println("Kategori Pendapatan\t:" + kategoriPendapatan);
        System.out.println("Alamat\t :"+ alamat[iId-1]);
        System.out.println("Biaya\t:Rp." + bayar+",-");
}
}