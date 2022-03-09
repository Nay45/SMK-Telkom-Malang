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
public class UKL_No4_VariasiSoal {
    static int hitung(int idCottage , int idGolonganHari , int lama) {
        int bayar = 0;
        
        int weekday[]={915000,915000,575000,575000,595000,595000,495000,495000,495000,25000};
        int weekend[]={1025000,1025000,695000,695000,715000,715000,575000,575000,575000,25000};
        int holiday[]={1225000,1225000,895000,895000,915000,915000,755000,755000,755000,35000};
        
        if(idGolonganHari == 1){
            bayar = weekday[idCottage - 1] * lama;
        } else if (idGolonganHari == 2){
            bayar = weekend[idCottage - 1] * lama;
        } else{
            bayar = holiday[idCottage - 1] * lama;
        }
        
        return bayar;
    }

	public static void main(String[] args) {
		int id[]={1,2,3,4,5};//id
        String nama[] = {"Ali","Budi","Dani","Edi","Umar"};
        
        int idCottage[] = {1,2,3,4,5,6,7,8,9,10};
        String namaCottage[] = {"Duku","Jeruk","Alpukat","Jambu Air","Durian","Melon","Belimbing","Mangga","Kedondong","Barrack"};
        
        int idGolonganHari[] = {1,2,3};
        String namaGolonganHari[] = {"Weekday","Weekend","Holiday"};
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan id pelanggan");
        String idIn = myObj.nextLine();
        int iId=Integer.valueOf(idIn);
        
        Scanner myObja = new Scanner(System.in);
        System.out.println("Masukkan id cottage");
        String idCottages = myObja.nextLine();
        int iIdCottage = Integer.valueOf(idCottages);
        
        Scanner myObjb = new Scanner(System.in);
        System.out.println("Masukkan golongan hari");
        String idGolongan = myObjb.nextLine();
        int iIdGolongan = Integer.valueOf(idGolongan);
        
        Scanner myObjc = new Scanner(System.in);
        System.out.println("Masukkan lama menginap");
        String idLama = myObjc.nextLine();
        int iIdLama = Integer.valueOf(idLama);
        
        int totalbayar =  hitung(iIdCottage , iIdGolongan , iIdLama);
        
        System.out.println("Print Out Tagihan");
        System.out.println("ID Pelanggan\t:" + iId);
        System.out.println("Nama Pelanggan\t:" + nama[iId-1]);
        System.out.println("Jumlah Hari\t:" + iIdLama);
        System.out.println("Tipe Cottage\t:" + namaCottage[iIdCottage-1]);
        System.out.println("Biaya\t:Rp." + totalbayar+",-");
	}
    
//    public static void main(String[] args){
//    int lama;
//        int bayar = 0;
//        
//        int weekday[]={915000,915000,575000,575000,595000,595000,495000,495000,495000,25000};
//        int weekend[]={1025000,1025000,695000,695000,715000,715000,575000,575000,575000,25000};
//        int holiday[]={1225000,1225000,895000,895000,915000,915000,755000,755000,755000,35000};
//        
//        int id[]={1,2,3,4,5};//id
//        String nama[] = {"Ali","Budi","Dani","Edi","Umar"};
//        
//        int idCottage[] = {1,2,3,4,5,6,7,8,9,10};
//        String namaCottage[] = {"Duku","Jeruk","Alpukat","Jambu Air","Durian","Melon","Belimbing","Mangga","Kedondong","Barrack"};
//        
//        int idGolonganHari[] = {1,2,3};
//        String namaGolonganHari[] = {"Weekday","Weekend","Holiday"};
//        
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Masukkan id pelanggan : ");
//        String idIn = myObj.nextLine();
//        int iId=Integer.valueOf(idIn);
//        
//        Scanner myObja = new Scanner(System.in);
//        System.out.println("Masukkan id cottage : ");
//        String idCottages = myObja.nextLine();
//        int iIdCottage = Integer.valueOf(idCottages);
//        
//        Scanner myObjb = new Scanner(System.in);
//        System.out.println("Masukkan golongan hari : ");
//        String idGolongan = myObjb.nextLine();
//        int iIdGolongan = Integer.valueOf(idGolongan);
//        
//        Scanner myObjc = new Scanner(System.in);
//        System.out.println("Masukkan lama menginap : ");
//        String idLama = myObjc.nextLine();
//        int iIdLama = Integer.valueOf(idLama);
//        
//        if(iIdGolongan == 1){
//            bayar = weekday[iIdCottage - 1] * iIdLama;
//        } else if (iIdGolongan == 2){
//            bayar = weekend[iIdCottage - 1] * iIdLama;
//        } else{
//            bayar = holiday[iIdCottage - 1] * iIdLama;
//        }
//     
//        
//        System.out.println("Print Out Tagihan");
//        System.out.println("ID Pelanggan\t:" + iId);
//        System.out.println("Nama Pelanggan\t:" + nama[iId-1]);
//        System.out.println("Jumlah Hari\t:" + iIdLama);
//        System.out.println("Tipe Cottage\t:" + namaCottage[iIdCottage-1]);
//        System.out.println("Biaya\t:Rp." + bayar+",-");
//}
}