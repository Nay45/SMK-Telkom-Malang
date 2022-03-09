/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanUKL;

/**
 *
 * @author USER
 */
public class LatihanPakZaka1 {
    public static void main(String[] args){
        int a = 4;
        int b = 9;
        int total = 0;
        
        System.out.println("Deret aritmatika");
        for (int i=14; i <= 30; i++){
            int u = a + ((i-1) * b);
            total = total + u;
            System.out.println(u);
        }
        System.out.println("\nTotal deret : " + total);
    }
}