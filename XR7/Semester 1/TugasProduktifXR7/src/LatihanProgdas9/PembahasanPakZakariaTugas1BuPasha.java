/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanProgdas9;

/**
 *
 * @author USER
 */
public class PembahasanPakZakariaTugas1BuPasha {
    public static void main(String[] args){
        int angka[] = {10,20,4,5,8};
        System.out.println("Sebelum diurutkan : ");
        for (int i=0; i<angka.length; i++){
            System.out.print(angka[i] + "\t");
        }
        
        int hasilurutan[] = pengurutanangka(angka);
        System.out.println("\nSetelah diurutkan : ");
        for (int i=0; i<hasilurutan.length; i++){
        System.out.print(hasilurutan[i] + "\t");
        
    }
//        makan("Nasi Goreng", "Coca Cola");
    }
    public static int[] pengurutanangka(int bil[]){
        for (int i=0; i<bil.length; i++){
            for (int j=i + 1; j<bil.length; j++){
                if (bil[i]<bil[j]){
                int temp = bil[i];
                bil[i]=bil[j];
                bil[j]=temp;
            }
        }
    }
        return bil;
    }
//    public static int penjumlahan(int a, int b){
//        int hasil = a + b;
//        return 0;
//    }
//    public static void makan(String makanan, String minuman){
//        System.out.println("Saya makan " + makanan);
//        System.out.println("Saya minum " + minuman);
//    }
}
//fungsi memiliki 2 jenis
//void (tidak perlu menggunakan value return)
//non-void (memerlukan value return) 