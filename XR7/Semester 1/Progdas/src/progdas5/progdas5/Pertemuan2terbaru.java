/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas5.progdas5;

/**
 *
 * @author USER
 */
public class Pertemuan2terbaru {
    public static void main(String[] args) {
    int mawar=10,melati=2,matahari=5;
        double harga;
        harga = 4500.5;
        double total, bayar;

        melati+=2;
        total=mawar+melati+matahari;
        bayar=total*harga;
        System.out.println("jumlah barang yang dibeli = "+mawar+"+"+melati+"+"+matahari+"="+total);
        System.out.println("total yang dibayar  = Rp"+bayar);

        boolean x;
        
        x=mawar>melati;
        System.out.println("Bunga mawar > bunga melati "+x);
        System.out.println("Pembelian bunga mawar lebih banyak daripada bunga melati "+x);
        
        x=matahari>mawar;
        System.out.println("Bunga matahari > bunga mawar "+x);
        System.out.println("Pembelian bunga matahari lebih banyak daripada bunga mawar "+x);
}
}
