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
public class PernyataanWhile {
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        int a = 0, total = 0, bil = 7;
        while (bil !=0){
            a++;
            System.out.print("Masukkan bilangan ke-" + a + " : ");
            bil = masuk.nextInt();
            total += bil;
        }
        System.out.println("Total jumlah " + (a-1) + " bilangan : ");
        System.out.println(total);
    }
}
