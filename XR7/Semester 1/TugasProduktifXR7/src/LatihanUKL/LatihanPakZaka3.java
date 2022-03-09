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
public class LatihanPakZaka3 {
    public static void main(String[] args){
        int a = 4;
        int b = 9;
        
        for (int i=3; i>=1; i--){
            for (int n=1; n<=i; n++){
                System.out.print(a + "\t");
                a = a+b;
            }
            System.out.println("");
        }
    }
}
