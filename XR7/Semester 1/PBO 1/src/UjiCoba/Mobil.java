/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UjiCoba;

/**
 *
 * @author USER
 */
public class Mobil {
    //atribut
    public String bahanBakar = "";
    public int jumlahRoda = 0;
    public int kecepatan = 0;
    
    //constructor
    public Mobil() {
        bahanBakar = "Pertalite";
        jumlahRoda = 4;
        kecepatan = 80;
    }
    
    public Mobil(String a, int b, int c) {
        bahanBakar = a;
        jumlahRoda = b;
        kecepatan = c;
    }
    
    //operasi
    public void mogok() {
        System.out.println("Mobil ini sedang mogok");
        System.out.println("Bahan bakar : " + bahanBakar);
        System.out.println("Jumlah Roda : " + jumlahRoda);
        System.out.println("Kecepatan : " + kecepatan);
    }
    
    public void berjalan() {
        System.out.println("Mobil ini sedang berjalan");
        System.out.println("Bahan bakar : " + bahanBakar);
        System.out.println("Jumlah Roda : " + jumlahRoda);
        System.out.println("Kecepatan : " + kecepatan);
    }
    
    public void diperbaiki() {
        System.out.println("Mobil ini sedang diperbaiki");
        System.out.println("Bahan bakar : " + bahanBakar);
        System.out.println("Jumlah Roda : " + jumlahRoda);
        System.out.println("Kecepatan : " + kecepatan);
    }
}
