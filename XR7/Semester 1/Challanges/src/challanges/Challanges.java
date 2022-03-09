/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challanges;

/**
 *
 * @author USER
 */
public class Challanges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nomortransaksi, tanggalwaktu, nama;
        double totalharga, hargapembelian, kembalian;
        
        nomortransaksi = "3421093888";
        totalharga = 72000;
        hargapembelian = 100000;
        kembalian = hargapembelian - totalharga;
        nama = "Nayottama Lucky Mustafa";
        tanggalwaktu = "Senin, 6 September 2021";
        
        System.out.println("Pembelian " + nama + " dengan nomor transaksi " + nomortransaksi);
        System.out.println("Tanggal: " + tanggalwaktu);
        System.out.println("Total harga: " + totalharga);
        System.out.println("yang dibayar: " + hargapembelian);
        System.out.println("dapat kembalian: " + kembalian);
    }
    
}
