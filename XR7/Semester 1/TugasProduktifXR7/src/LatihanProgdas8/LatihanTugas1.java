/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanProgdas8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LatihanTugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int hari;
        double bayar;
        int day = 0;
        String data[][] = {
            {"Durian","3","100000","200000","300000"},
            {"Pisang","2","150000","260000","380000"},
            {"Lombok","1","50000","130000","320000"}
        };
        System.out.print("Inputkan jumlah hari : ");
        hari = input.nextInt();
        System.out.print("inputkan nama room : ");
        String room = input.next();
        System.out.print("Input jenis hari (weekday-weekend-holiday) : ");
        String jenis = input.next();
        if(jenis.equals("weekday")){
            day = 2;
        }else if (jenis.equals("weekend")){
            day = 3;
        }else if (jenis.equals("holiday")){
            day = 4;
        }else {
            System.out.println("Data tidak valid");
        }
        for (int h=0; h<data.length; h++){
//            for (int n=0; n<data[h].length; n++){
//                if (data [h][n].equals(room)){
                    if (data [h][0].equals(room)){
//                    System.out.println("Room : " + data[h][2]);
                    bayar = hari*Double.parseDouble(data[h][day]);
                    System.out.println("Jumlah bayar : " + bayar);
                }
            }
        }
    }
