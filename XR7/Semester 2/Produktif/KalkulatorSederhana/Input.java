package KalkulatorSederhana;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int a = input.nextInt();
        System.out.print("Masukkan Operasi : ");
        var operasi = input.next();
        System.out.print("Masukkan nilai kedua : ");
        int b = input.nextInt();

        System.out.println(hitung(a, operasi , b));

    }
    public static int hitung (int a,String operasi, int b){
        switch(operasi){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;

        }

    }
}
