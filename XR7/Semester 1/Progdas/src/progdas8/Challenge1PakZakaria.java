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
public class Challenge1PakZakaria {
    public static void main(String[] args){
        double umur[] = {30, 50, 32, 40, 21, 15};
        double totaldata = 0;
        for (int i = 0; i<umur.length; i++){
            totaldata = totaldata + umur[i];
        }
        double averageumur = totaldata / umur.length;
        System.out.println("Rata-rata umur : " + averageumur);
    }
}
