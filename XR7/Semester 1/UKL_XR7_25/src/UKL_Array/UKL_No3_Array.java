/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL_Array;

/**
 *
 * @author USER
 */
public class UKL_No3_Array {
    public static void main(String[] args) {
//        int a[][]={{6,3,2},{4,2,3}};
//        int b[][]={{1,2},{2,3},{3,1}};
//        int h[][]={{0,0},{0,0}};
//        System.out.println("Hasil AxB");
//        //proses perhitungan
//        for(int i=0;i<2;i++){
//        for(int j=0;j<2;j++){ 
//        for(int k=0;k<3;k++){ 
//        h[i][j]=h[i][j]+a[i][k]*b[k][j];
//        }
//        }
//        }
//        //menampilkan hasil
//        for(int i=0;i<2;i++){
//        for(int j=0;j<2;j++){
//        System.out.print(h[i][j]+"\t");
//        }
//        System.out.println();
//        }

            int a[][]={
            {6,3,2},
            {4,2,3}
            };
            int b[][]={
            {1,2},
            {2,3},
            {3,1}
            };
    
    
            System.out.println("Hasil AxB");
            //proses perhitungan
             for (int bA = 0; bA < a.length; bA++){ //melakukan perulangan pada baris a
                 for (int kB = 0; kB < b[0].length; kB++){ //melakukan perulangan pada kolom b
                      int hasil = 0;
                      //mulai proses perkalian
                      for (int i = 0; i < a[bA].length; i++){
                         hasil+=(a[bA][i] * b[i][kB]);
                     }
                     System.out.print(hasil+"\t");
                     }
                    System.out.println();
            }
     }
}
