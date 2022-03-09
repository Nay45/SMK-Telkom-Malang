/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanUKL;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LatihanPakZaka5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String data [][] = {
            {"1", "Galuh", "1", "Sawojajar"},
            {"2", "Indro", "3", "Kedung kandang"},
            {"3", "Jedi", "2", "Ijen"},
            {"4", "Kanu", "3", "Dinoyo"}
        };
        
        System.out.println("Tagihan Listrik");
        System.out.println("======================");
        System.out.print("Masukkan id : ");
        String id = input.next();
        System.out.print("Masukkan banyaknya pemakaian listrik (Kwh) : ");
        int kwh = input.nextInt();
        
        String golongan = null;
        
        for (int i=0; i<data.length; i++){
            if (data[i][0].equalsIgnoreCase(id)){
                golongan = data[i][2]; 
            }
        }
        int tarif = 0;
        if (golongan.equalsIgnoreCase("1")){
            tarif = 1000;
    }else if (golongan.equalsIgnoreCase("2")){
        tarif = 1300;
    }else if (golongan.equalsIgnoreCase("3")){
        tarif = 1500;
    }
        
    int tagihan = tarif * kwh + 13000;
    if (tagihan<50000){
        System.out.println("Tagihan : 50000");
    }else {
        System.out.println("Tagihan : " + tagihan);
    }
}
}