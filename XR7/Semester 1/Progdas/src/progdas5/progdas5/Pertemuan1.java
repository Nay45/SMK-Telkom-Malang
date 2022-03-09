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
public class Pertemuan1 {
    public static void main(String[] args) {
        int semangka=7, jambu=3;
        double harga_semangka, harga_jambu;
        harga_semangka = 3000.2;
        harga_jambu = 2340.2;
        double total,  bayar;
        

        /*operator penugasan (pembelian yang mengurangi stok)*/ 
        jambu-=2; 
        semangka-=3;
        /* Operator Aritmatika (total barang tersedia)*/
        total=semangka+jambu;
        
    System.out.println("jumlah barang yang tersedia =" +semangka+ "+" +jambu+ 
                "=" +total);
        
        bayar= (total*harga_jambu)+(total*harga_semangka);
        //total aset yang dimiliki
        System.out.println("total aset yang dimiliki  = Rp"+bayar);    
    		}
}
