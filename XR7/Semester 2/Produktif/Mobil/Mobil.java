package Mobil;

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
        System.out.println("Mobil.Mobil ini sedang mogok");
        System.out.println("Bahan bakar : " + bahanBakar);
        System.out.println("Jumlah Roda : " + jumlahRoda);
        System.out.println("Kecepatan : " + kecepatan);
    }

    public void berjalan() {
        System.out.println("Mobil.Mobil ini sedang berjalan");
        System.out.println("Bahan bakar : " + bahanBakar);
        System.out.println("Jumlah Roda : " + jumlahRoda);
        System.out.println("Kecepatan : " + kecepatan);
    }

    public void diperbaiki() {
        System.out.println("Mobil.Mobil ini sedang diperbaiki");
        System.out.println("Bahan bakar : " + bahanBakar);
        System.out.println("Jumlah Roda : " + jumlahRoda);
        System.out.println("Kecepatan : " + kecepatan);
    }
}