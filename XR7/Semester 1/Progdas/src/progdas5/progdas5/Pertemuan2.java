/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas5.progdas5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pertemuan2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("jumlah bunga mawar yang dibeli : ");
        int mawar = input.nextInt();
        
        System.out.println(" ");
        
        System.out.print("jumlah bunga melati yang dibeli : ");
        int melati=input.nextInt();
        
        System.out.println(" ");
        
        System.out.print("jumlah bunga matahari yang dibeli : ");
        int matahari=input.nextInt();
        double harga;
        harga = 4500.5;
        double total, bayar;
        
        total=mawar+melati+matahari;
        bayar=total*harga;
        
        System.out.println(" ");
        
        System.out.println("jumlah barang yang dibeli = "+mawar+"+"+melati+"+"+matahari+"="+total);
        System.out.println(" ");
        System.out.println("total yang perlu dibayar  = Rp"+bayar);    
        
        boolean x, y, z;
        x = mawar > melati;
        y = mawar > matahari;
        z = melati > matahari;
        
        System.out.println(" ");
        
        System.out.println("bunga mawar > bunga melati "+x);
        System.out.println("pembelian bunga mawar lebih banyak dari bunga melati "+x);
        
        System.out.println(" ");
        
        System.out.println("bunga mawar > bunga matahari "+y);
        System.out.println("pembelian bunga mawar lebih banyak dari bunga matahari "+y);
        
        System.out.println(" ");
        
        System.out.println("bunga melati > bunga matahari "+z);
        System.out.println("pembelian bunga melati lebih banyak dari bunga matahari "+z);
    }
    
}