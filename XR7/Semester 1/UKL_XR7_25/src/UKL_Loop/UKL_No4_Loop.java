/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL_Loop;

/**
 *
 * @author USER
 */
public class UKL_No4_Loop {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int u=0;
 
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<6;i++){
        for(int j=0;j<i;j++){
        u+=a;
        System.out.print(a+"\t");
        a+=b;
        }
        System.out.println();
        }
        for(int i=0;i<5;i++){ 
        for(int j=0;j<4-i;j++){
        u+=a;
        System.out.print(a+"\t");
        a+=b;
        }
        System.out.println();
        }
        System.out.println("Jumlah Deret Aritmatikanya adalah "+u);
    }

}
