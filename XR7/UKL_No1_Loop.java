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
public class UKL_No1_Loop {
    public static void main(String[] args) {
         int a=5;
         int b=3;
         int s=0;
         
         System.out.println("Deret Aritmatikanya adalah");
         for(int i=15;i<=24;i++){
             int u = a + ((i-1)*b);
         s+=u;
         System.out.println("U" + i + " = " + u);
         
    }
         System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }
}