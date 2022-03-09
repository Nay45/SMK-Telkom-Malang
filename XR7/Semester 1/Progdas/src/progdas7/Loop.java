/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas7;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int tinggi = input.nextInt();
        
        for(int a=tinggi; a>=1; a--){
            for (int b=1; b<=a; b++){
                System.out.print(b + "*\t");
            }
            System.out.println("");
        }
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Masukkan angka : ");
//        int tinggi = input.nextInt();
//        
//        for(int a=1; a<=tinggi; a++){
//            for (int b=1; b<=a; b++){
//                System.out.print(b + "*\t");
//            }
//            System.out.println("");
//        }
    }
}
