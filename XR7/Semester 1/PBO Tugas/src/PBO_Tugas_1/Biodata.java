/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_Tugas_1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Biodata {
    static void data (int nama){
        String pengguna [] = {"Alfin","Yodig","Lutfi","Reyhan"};
        String nis [] = {"696969","212121","252525","101010"};
        String tempat [] = {"Mars","Planet bekasi","Kaki gunung semeru","Moana loa"};
        String tanggal [] = {"31 april 2034","22 juli 2137","24 mei 1977","30 desember 2000"};
        String gender [] = {"L","L","L","L"};
        String alamat [] = {"Jl. Danau Poso 1","Jl. Danau Poso 1","Jl. Danau Poso 1","Jl. Danau Poso 1"};
        String motto [] = {"Hidup seperti larry","Mangan turu ngising","Jedag jedug is my life","Sing penting waras"};
        
        if (nama==1 || nama==2 || nama==3 || nama==4){
            System.out.println("Nama : " + pengguna[nama-1]);
            System.out.println("NIS : " + nis[nama-1]);
            System.out.println("Tempat lahir : " + tempat[nama-1]);
            System.out.println("Tanggal lahir : " + tanggal[nama-1]);
            System.out.println("Jenis kelamin : " + gender[nama-1]);
            System.out.println("Alamat : " + alamat[nama-1]);
            System.out.println("Motto hidup : " + motto[nama-1]);
        }else {
            System.out.println("Nope");
        }
    }
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("ID biodata");
        System.out.println("===============");
        System.out.println("1. Alfin");
        System.out.println("2. Yodig");
        System.out.println("3. Lutfi");
        System.out.println("4. Reyhan");
        System.out.println("===============");
        System.out.print("Masukkan ID : ");
        String ID = input.nextLine();
        int iID=Integer.valueOf(ID);
        
        data(iID);
    }
    }