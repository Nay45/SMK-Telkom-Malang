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
public class UKL_No2_Loop {
    public static void main(String[] args) {
         int a=5;
         int b=3;
         int n=0;
         int s = 2;
         int u = a + ((s-1)*b);
         
         System.out.println("Deret Aritmatikanya adalah");
         for(int i=0;i<2;i++){
         for(int j=0;j<5;j++){
         n+=u;
         System.out.print(u+"\t");
         u+=b;
         }
         System.out.println();
         }
         System.out.println("Jumlah Deret Aritmatikanya adalah "+n);
    }
}
