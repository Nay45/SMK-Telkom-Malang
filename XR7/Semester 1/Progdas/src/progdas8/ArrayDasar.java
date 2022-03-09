/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas8;

/**
 *
 * @author USER
 */
public class ArrayDasar {
    public static void main(String[] args){
//        String siswa[] = {"Marine", "Sena", "Gawr Gura", "Moona"};
//        for (int i=0; i<siswa.length; i++) {
//            System.out.println(siswa[i] + "\n");
//        System.out.println(siswa[2]);
//        
//        double harga[] = {4500, 3000, 2500, 5000, 8000};
//        System.out.println(harga[3] + harga[2] + "\n");
        
         double matriks[][] = {
         {8,9,7},
         {3,5,7},
         {4,8,5},
    };
//         matriks.length = 3(dihitung kurung)
//         matriks[0].length = dihitung posisi data
//         System.out.println(matriks[2][1]);
for (int n=0; n<matriks.length; n++){
    for (int m=0; m<matriks[n].length; m++){
        System.out.println(matriks[n][m]);        
    }
        }
    }
}