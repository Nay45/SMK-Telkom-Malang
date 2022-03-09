/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challanges;

/**
 *
 * @author USER
 */
public class LatihanUKL3 {
    public static void main(String[] args){
        int a = 7;
        int b = 3;
        int n = a;
        int s = 0;
        
        
        for (int i=5; i>0; i--){
            for (int e=0; e<=i-1; e ++){
            s += a;
            System.out.print(a + "\t");
            a += b;
            }
            System.out.println("");
        }
        System.out.println("Total : " + s);
        
        int tinggi = 4;
        int spasi = tinggi;
        
        for (int i = 0; i < tinggi; i++) {
//            print spasi
              for (int k = 1; k < spasi-i; k++) {
                  System.out.print(" ");
              }
              
//             print *
               for (int j = 0; j < i+1; j++) {
                   System.out.print("* ");
               }
               System.out.println();
}
            }
            }