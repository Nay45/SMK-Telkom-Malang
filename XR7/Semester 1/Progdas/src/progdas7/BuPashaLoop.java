/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas7;

/**
 *
 * @author USER
 */
public class BuPashaLoop {
    public static void main(String[] args){
        
//        for (int a=5; a>=1; a--){ //menurun
//        for (int b=a; b>=1; b--){ //mendatar
//            System.out.print(b + "\t");
//        }
//            System.out.println("");
//        }

        for (int m=1; m<=3; m++){
        for (int n=1; n<=m; n++){
              System.out.print("*\t");
        }
        System.out.println();
        }
        for (int m=2; m>=1; m--){
        for (int n=m; n>=1; n--){
            System.out.print("*\t");
        }
            System.out.println();
        }
        }
    }
