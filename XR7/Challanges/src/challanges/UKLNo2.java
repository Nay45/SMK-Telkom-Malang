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
public class UKLNo2 {
    static int hitung(String pendapatan , String jalur , int bulan) {
         int bayar = 0;
        
         //kondisi jalur
         if (jalur == "SBMPTN"){
             //kondisi kelas golonganPendapatan
             if(pendapatan == "A"){
                //golonganA
                bayar = (bulan * 500000) + 5000000;
             }else if (pendapatan == "B") {
                //golonganB
                bayar = (bulan * 1000000) + 15000000;
             }else{
                //golonganC
                bayar = (bulan * 2000000) + 30000000;
             }
         } else if (jalur == "SNMPTN"){
            //kondisi kelas golonganPendapatan
             if(pendapatan == "A"){
                //golonganA
                bayar = (bulan * 500000) + 7000000;
             }else if (pendapatan == "B") {
                //golonganB
                bayar = (bulan * 1000000) + 17000000;
             }else{
                //golonganC
                bayar = (bulan * 2000000) + 35000000;
             }
         } else if (jalur == "Mandiri"){
            //kondisi kelas golonganPendapatan
             if(pendapatan == "A"){
                //golonganA
                bayar = (bulan * 1000000) + 10000000;
             }else if (pendapatan == "B") {
                //golonganB
                bayar = (bulan * 2000000) + 25000000;
             }else{
                //golonganC
                bayar = (bulan * 3000000) + 50000000;
             }
         }
        
         return bayar;
    }
    
    static String kategoriPendapatan(int pendapatan){
        if(pendapatan < 2000000){
                //golonganA
                return "A";
             }else if (pendapatan >= 2000000 && pendapatan <= 10000000 ) {
                //golonganB
                return "B";
             }else{
                //golonganC
                return "C";
             }
    }

	public static void main(String[] args) {
		int id[]={1,2,3,4};//id
        String nama[]={"Mira", "Nina", "Oemar", "Pena"};//nama
        String jalurMasuk[]={"SBMPTN","SNMPTN","Mandiri","SBMPTN"};//jalur masuk
        String alamat[]={"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};//alamat
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan id mahasiswa");
        String idIn = myObj.nextLine();
        int iId=Integer.valueOf(idIn);
        
        System.out.println("Masukkan pendapatan orang tua");
        String pendapatan = myObj.nextLine();
        int iPendapatan = Integer.valueOf(pendapatan);
        
        System.out.println("Masukkan jumlah bulan SPP");
        String bulan = myObj.nextLine();
        int iBulan = Integer.valueOf(bulan);
        
        String kategoriPendapatan = kategoriPendapatan(iPendapatan);
        int totalbayar =  hitung(kategoriPendapatan , jalurMasuk[iId-1], iBulan);
        
        System.out.println("Print Out Tagihan");
        System.out.println("ID\t:" + idIn);
        System.out.println("Nama\t:" + nama[iId-1]);
        System.out.println("Jalur Masuk\t:" + jalurMasuk[iId-1]);
        System.out.println("Kategori Pendapatan\t:" + kategoriPendapatan);
        System.out.println("Biaya\t:Rp." + totalbayar+",-");
	}
}