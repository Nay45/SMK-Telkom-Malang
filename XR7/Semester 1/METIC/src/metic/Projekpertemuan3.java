/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metic;

/**
 *
 * @author USER
 */
public class Projekpertemuan3 {
public static int max(int[] numbers){
        int highest = numbers[0];
         
        // for each loop
        for (int num : numbers)
        {
            if (num > highest)
            {
                highest = num;
            }
        }
    return highest;
    }
        
    public static void main(String[] arg)
    {
        {
            int[]skor = { 90, 45, 95, 79, 65 };             
            int skorTertinggi = max(skor);
            System.out.println("Yang memiliki Highest Score dengan perolehan skor : " + skorTertinggi);
        }
    }  
}
