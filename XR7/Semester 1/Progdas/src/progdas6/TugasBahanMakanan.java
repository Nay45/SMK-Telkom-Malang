/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TugasBahanMakanan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String identitas = "Nayottama Lucky Mustafa / XR7 / 26";
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nSaran Resep dari bahan milik anda");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Masukkan bahan pertama : ");
        int bahan1 = input.nextInt();
        
        if (bahan1==1 || bahan1==2){
    }else {
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, " + "tidak dapat memberikan saran resep");
        }
        if (bahan1==1){
            System.out.println("\nBahan kedua : ");
            System.out.println("1. Susu");
            System.out.println("2. Minyak goreng");
            System.out.println("3. Tidak ada");
            System.out.print("Masukkan bahan kedua : ");
            int bahan2 = input.nextInt();
            
        if (bahan2>=1 && bahan2<=3){
            switch(bahan2)
                {
                    case 1 : System.out.println("Anda dapat membuat milk shake banana");break;
                    case 2 : System.out.println("Anda dapat membuat pisang goreng");break;
                    case 3 : System.out.println("Anda dapat membuat pisang rebus");break;
                }
        }else {
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, " + "tidak dapat memberikan saran resep");
        }
        }
        if (bahan1==2){
            System.out.println("\nPilih bahan kedua untuk rekomendasi resep : ");
            System.out.println("1. Minyak goreng");
            System.out.println("2. Roti");
            System.out.println("3. Tidak ada");
            System.out.print("Masukkan bahan kedua : ");
            int bahan2 = input.nextInt();
            
        if (bahan2>=1 && bahan2<=3){
            switch(bahan2)
                {
                    case 1 : System.out.println("Anda dapat membuat telur mata sapi");break;
                    case 2 : System.out.println("Anda dapat membuat sandwich telur");break;
                    case 3 : System.out.println("Anda dapat membuat telur rebus");break;
                }
        }else {
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, " + "tidak dapat memberikan saran resep");
        }
        }
}
}