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
public class UKL_No1_VariasiSoal {
    public static void main(String[] args) {
        int id[]={1,2,3,4};//id pelanggan
        String namaPelanggan[]={"Galuh", "Indro", "Jedi", "Kanu"};//namapelanggan
        int golongan[]={1,3,2,3};//golongan
        String alamat[]={"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};//alamat
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan id pelanggan");
        String idIn = myObj.nextLine();
        int iId=Integer.valueOf(idIn);
        
        System.out.println("Masukkan jumlah pemakaian");
        String pemakaian = myObj.nextLine();
        int iTagihan = Integer.valueOf(pemakaian);
        
        int bayar = 50000;
        
         //penghitungan golongan
         if (golongan[iId-1] == 1){
            bayar  = iTagihan * 1000;
         } else if (golongan[iId-1] == 2){
            bayar  = iTagihan * 1300;
         } else if (golongan[iId-1] == 3){
            bayar  = iTagihan * 1500;
         }
         
         if(bayar < 50000){ //Tagihan pengunaan listrik dibawah Rp.50.000,- dianggap Rp.50.000,-
             bayar = 50000;
         }
         
         bayar = bayar  + 13000;  //biaya admin
        
         int pajak = bayar * 5/100;
         
         int hasilakhir = bayar + pajak;
        
        System.out.println("Print Out Tagihan");
        System.out.println("ID\t:" + idIn);
        System.out.println("Nama\t:" + namaPelanggan[iId-1]);
        System.out.println("Tagihan\t:Rp." + hasilakhir+",-");
        System.out.println("Alamat\t:" + alamat[iId-1]);
        System.out.println("Golongan\t:" + golongan[iId-1]);
    }
}