/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metic;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Projekpertemuan5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int akuvariable;
        boolean prima=true;
        String jawab;
        
        do{
        System.out.println("=====================================");
        System.out.print("Silakan masukkan angka : ");
        int angka = input.nextInt();
        
        for (int pembagi = 2; pembagi<=angka/2; pembagi++){
            akuvariable = angka%pembagi;
            if(akuvariable==0){
                prima = false;
            }
            }
        if(prima && (angka > 1)){
            System.out.println(angka + " adalah bilangan prima");
        }else{
            System.out.println(angka + " bukanlah bilangan prima");
        }
        System.out.print("ulangi(Y/T)? ");
         jawab = input.next();
         System.out.println("=====================================\n");
    }while(jawab.equalsIgnoreCase("Y"));
}
}