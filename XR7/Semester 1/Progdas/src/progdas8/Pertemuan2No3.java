/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pertemuan2No3 {
    public static void main(String[] args){
        String siswa[] = {"Raihan","Nuevalen","Shevia","Zhidan","Oryza"};
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan pilihan anda : ");
        int pilihan = input.nextInt();
        
        if(pilihan <=4){
            System.out.println(siswa[pilihan]);
        }else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
