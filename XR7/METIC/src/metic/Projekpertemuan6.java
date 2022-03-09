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
public class Projekpertemuan6 {
    public static void rumus (int[] arr){
        int f = arr.length;
        int temp = 0;
        
        for (int n = 0; n<f; n++){
            for (int m = 1; m<(f); m++){
            if (arr[m-1] > arr[m]){
                temp = arr[m-1];
                arr[m-1] = arr[m];
                arr[m] = temp;
        }
        }
    }
}
    
    public static void main (String[] args){
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        
        rumus(arr);
        
        System.out.println("Di  ururtkan : ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "   ");
        }
    }
}
//do
//
//  swapped = false
//
//  for i = 1 to indexOfLastUnsortedElement-1{
//
//    if leftElement > rightElement  12 3
//
//      swap(leftElement, rightElement)
//
//      swapped = true
//      }
//
//while swapped