/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProgdas9;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ChallengePakZakaria1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        
        double nt,f;
        
        String data[][] = {
//            {id,nama,berat,tinggi}
            {"01", "Peter","80","1.85"},
            {"02", "John","65","1.65"},
            {"03", "Robert","90","1.98"},
            {"04", "Tyson","70","1.8"},
            {"05", "Mia","60","1.9"}
        };
        
        System.out.print("Pilih nama : ");
        String nama = input.next();
        
        System.out.println("");
                
        for (int i=0;i<data.length; i++){
            for (int n=0;n<data[i].length;n++){
                if (nama.equalsIgnoreCase(data[i][1])){
                System.out.print(data[i][n] + " ");
            }
        }
        }
        System.out.println("\n");
        
        if (nama.equalsIgnoreCase("Peter")){
            nt = Double.parseDouble(data[0][2]);
            f = Double.parseDouble(data[0][3]);
            hitungBMI(nt, f);
        }else if (nama.equalsIgnoreCase("John")){
            nt = Double.parseDouble(data[1][2]);
            f = Double.parseDouble(data[1][3]);
            hitungBMI(nt, f);
        }else if (nama.equalsIgnoreCase("Robert")){
            nt = Double.parseDouble(data[2][2]);
            f = Double.parseDouble(data[2][3]);
            hitungBMI(nt, f);
        }else if (nama.equalsIgnoreCase("Tyson")){
            nt = Double.parseDouble(data[3][2]);
            f = Double.parseDouble(data[3][3]);
            hitungBMI(nt, f);
        }else if (nama.equalsIgnoreCase("Mia")){
            nt = Double.parseDouble(data[4][2]);
            f = Double.parseDouble(data[4][3]);
            hitungBMI(nt, f);
        }else {
            System.out.println("Not Found");
        }
//        for (int i=0; i<data.length; i++){
//        nt = Double.parseDouble(data[i][2]);
//        f = Double.parseDouble(data[i][3]);
//                hitungBMI(nt, f);
//        menampilkan seluruh data array beserta BMI-nya
//        }
    }
    public static double hitungBMI(double berat, double tinggi){
//        bmi=berat/(tinggi*tinggi)
        double BMI = berat/(tinggi*tinggi);
        System.out.print("BMI : " + berat + "/" + "(" + tinggi + "*" + tinggi + ") : " + BMI);
        System.out.println("");
        return 0;
}
}