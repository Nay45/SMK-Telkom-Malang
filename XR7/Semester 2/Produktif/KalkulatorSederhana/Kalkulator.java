package KalkulatorSederhana;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        int b = input.nextInt();

        perhitungan(a, b);
    }

    public static void perhitungan (int a, int b){
        int jumlah = a + b;
        int kurang = a - b;
        int kali = a * b;
        int bagi = a / b;
        int modulus = a % b;
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Kurang : " + kurang);
        System.out.println("Kali : " + kali);
        System.out.println("Bagi : " + bagi);
        System.out.println("Modulus : " + modulus);
    }
}
