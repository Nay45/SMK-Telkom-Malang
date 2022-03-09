/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas6;



/**
 *
 * @author USER
 */
public class Pertemuan3m6 {
    public static void main(String[] args) {
        
        String nilai="90";
        switch (nilai) {
     case "90":
             System.out.println("nilai anda : "+nilai);
         System.out.println("Predikat nilai A: Sangat baik");
             break;
     case "80":
             System.out.println("nilai anda : "+nilai);
         System.out.println("Predikat nilai B: Baik");
             break;
      case "70":
          System.out.println("nilai anda : "+nilai);
          System.out.println("Predikat nilai C: Cukup");
          break;
      case "60":
          System.out.println("nilai anda : "+nilai);
          System.out.println("Predikat nilai D: Kurang");
          break;
      case "50":
          System.out.println("nilai anda : "+nilai);
          System.out.println("Predikat nilai E: Sangat Kurang");
          break;
      default :
          System.out.println("Tidak memenuhi syarat");
 }
    
    }
}
