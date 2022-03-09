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
public class LatihanPakZaka2 {
    public static void main(String[] args){
        int a = 4, b =9;
        int n = 10;
        int u = a + ((n-1)*b);
//        matriks 3*4 (3 baris 4 kolom)
        for (int i = 1; i<=3; i++){
            for (int j=1; j<=4; j++){
                System.out.print(u + "\t");
                u = u+b;
            }
            System.out.println("");
        }
    }
}
