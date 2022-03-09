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
public class Projekpertemuan4 {
    public static void main(String[] args) {
       Scanner coba = new Scanner (System.in);
       String jawab = "" ;
        do{
           //ini input
         System.out.println("gg2");
         Scanner input = new Scanner(System.in);
         System.out.print("masukkan angka :");
        
         //numeric input
         int a = input.nextInt();
        
         //proses & output
         int gg = a%2;
         
         if(gg == 0){
             //System.out.print(a);
             System.out.println(a+" adalah genap");
         }else{
             //System.out.print(a);
             System.out.println(a+" adalah ganjil");
         }  
         System.out.print("ulangi(Y/T)?  ");
         jawab = coba.nextLine(); 
        
        }while(jawab.equalsIgnoreCase("Y"));
        
    }
}
