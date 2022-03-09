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
public class Challenge2PakZakaria {
    public static void main(String[] args){
        
//        double umur[] = {30, 50, 32, 40, 21, 15};
//        double umurtermuda = umur[0];
//        for (int i=0; i<umur.length; i++){
//            if (umur[i] < umurtermuda)
//            umurtermuda  = umur[i];
//        }
//        System.out.println("Umur termuda : " + umurtermuda);

//                double umur[] = {30, 50, 32, 40, 21, 15};
//        double umurtertua = umur[0];
//        for (int i=0; i<umur.length; i++){
//            if (umur[i] > umurtertua)
//            umurtertua  = umur[i];
//        }
//        System.out.println("Umur tertua : " + umurtertua);

            double umur[] = {30, 50, 32, 40, 21, 15};
            double jumlahremaja = 0;
            for (int i=0; i<umur.length; i++){
                if (umur[i] >= 12 && umur[i] <= 17) {
                    jumlahremaja++;
                    System.out.println("Banyaknya remaja : " + jumlahremaja);
                }
            }
    }
}
