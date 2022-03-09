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
public class UKL {
//    public static void main(String[] args) {
// int a=5;
// int b=3;
// int n=10;
// int u=a;
// int s=a;
// System.out.println("Deret Aritmatikanya adalah");
// for(int i=0;i<n;i++){ 
// System.out.println(u);
// u=u+b;
// s=s+u;
// }
// s=s-u;
// System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
//}
    
//    public static void main(String[] args) {
// int a=5;
// int b=3;
// int u=a;
// int s=a;
// System.out.println("Deret Aritmatikanya adalah");
// for(int i=0;i<3;i++){ 
// for(int j=0;j<4;j++){
// System.out.print(u+"\t");
// u=u+b;
// s=s+u; 
// }
// System.out.println();
// }
// s=s-u;
// System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
//}
    
//    public static void main(String[] args) {
// int a=5;
// int b=3;
// int u=a;
// int s=a;
// System.out.println("Deret Aritmatikanya adalah");
// for(int i=0;i<5;i++){ 
// for(int j=0;j<1+i;j++){
// System.out.print(u+"\t");
// u=u+b;
// s=s+u; 
// }
// System.out.println();
// }
// s=s-u;
// System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
//}
    
//    public static void main(String[] args) {
// int a=5;
// int b=3;
// int u=a;
// int s=a;
// System.out.println("Deret Aritmatikanya adalah");
// for(int i=0;i<3;i++){ 
// for(int j=0;j<3-i;j++){
// System.out.print(u+"\t");
// u=u+b;
// s=s+u; 
// }
// System.out.println();
// }
// for(int i=0;i<2;i++){ 
// for(int j=0;j<2+i;j++){
// System.out.print(u+"\t");
// u=u+b;
// s=s+u; 
// }
// System.out.println();
// }
// s=s-u;
// System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
//}
    
//    public static void main(String[] args) {
// int a[][]={{-7,5},{4,8}};
// int b[][]={{1,1},{-4,9}};
// System.out.println("Hasil A-B");
// for(int i=0;i<2;i++){ 
// for(int j=0;j<2;j++){ 
// System.out.print(a[i][j]-b[i][j]+"\t"); 
// }
// System.out.println();
// }
//}
    
//    public static void main(String[] args) {
// int a[][]={{6,3},{4,8}};
// int b[][]={{1},{2}};
// int h[][]={{0},{0}};
// System.out.println("Hasil AxB");
// //proses perhitungan
// for(int i=0;i<2;i++){
// for(int j=0;j<1;j++){ 
// for(int k=0;k<2;k++){ 
// h[i][j]=h[i][j]+a[i][k]*b[k][j];
// }
// }
// }
// //menampilkan hasil
// for(int i=0;i<2;i++){
// for(int j=0;j<1;j++){
// System.out.print(h[i][j]+"\t");
// }
// System.out.println();
// }
//}
    
//    static int hitung(int nilai) {
// int bayar=20000;
// nilai=nilai-10;
// 
// //pengitungan 10 kedua
// if (nilai>10){
// bayar=bayar+30000;
// nilai=nilai-10;
// }
// else {
// bayar=bayar+3000*nilai;
// nilai=0;
// }
// 
// //pengitungan 10 ketiga
// if (nilai>10){
// bayar=bayar+40000;
// nilai=nilai-10;
// }
// else {
// bayar=bayar+4000*nilai;
// nilai=0;
// }
// 
// //pengitungan selanjutnya
// if (nilai>10){
// bayar=bayar+3000*nilai;
// }
// 
// return bayar;
// }
// 
// public static void main(String[] args) { 
// int id[]={1,2,3,4,5};//id pelanggan
// String namaPelanggan[]={"Ali", "Budi", "Dani", "Edi", "Umar"};//nama pelanggan 
// 
// 
// Scanner myObj = new Scanner(System.in); 
// System.out.println("Masukkan id pelanggan");
// String idIn = myObj.nextLine(); 
// int iId=Integer.valueOf(idIn);
// 
// System.out.println("Masukkan jumlah tagihan");
// String tagihan = myObj.nextLine(); 
// int iTagihan = Integer.valueOf(tagihan);
// 
// if (iTagihan<10) {iTagihan=20000;}
// else {iTagihan=hitung(iTagihan);}
// 
// iTagihan=iTagihan+10000;
// 
// System.out.println("Print Out Tagihan");
// System.out.println("ID\t:" + idIn);
// System.out.println("Nama\t:" + namaPelanggan[iId-1]);
// System.out.println("Tagihan\t:Rp." + iTagihan+",-");
// }
    
    public static void main(String[] args){
    int tinggi = 5;
        int spasi = tinggi;
        
        for (int i = 0; i < tinggi; i++) {
//            print spasi
              for (int s = 1; s < spasi-i; s++) {
                  System.out.print(" ");
              }
              
//             print *
               for (int b = 0; b < i+1; b++) {
                   System.out.print("* ");
               }
               System.out.println("");
        }
}
    
//    public static void main(String[] args){
//        int a=3;
//        int b=5;
//        int u=a;
//        int s=a;
//        System.out.println("Deret aritmatika");
//        for (int i=0;i<5;i++){
//            for (int h=0;h<5-i;h++){
//                System.out.print(u + "\t");
//                u=u+b;
//                s=s+u;
//            }
//            System.out.println();
//        }
//        s=s-u;
//        System.out.println("Jumlah : " + s);
//    }
    
//        static int hitung(int idMasuk , int idKeluar , int golongan) {
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
//}
}