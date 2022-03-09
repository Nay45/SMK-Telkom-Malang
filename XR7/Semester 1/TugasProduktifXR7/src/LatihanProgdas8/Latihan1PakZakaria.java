/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanProgdas8;


/**
 *
 * @author USER
 */
public class Latihan1PakZakaria {
    public static void main(String[] args){
        
        String data [][] = {
            {"Supreme mie", "5", "10000"},
            {"Mie sadap", "3",  "5000"},
            {"Selera rakyat", "10", "4500"},
            {"Live boy", "20", "3000"}
        };
        
        int jumlahitem = 0;
        int totalharga = 0;
        
        for (int i=0; i<data.length; i++){
            jumlahitem = jumlahitem + Integer.parseInt(data[i][1]);
            
            int jumlah = Integer.parseInt(data[i][1]);
            int harga = Integer.parseInt(data[i][2]);
            if (jumlah > 5){
                harga = harga - 1000;
            
//            totalharga = totalharga + (Integer.parseInt(data[i][1])*Integer.parseInt(data[i][2])); total harga = total harga + (jumlah * harga)
            
           totalharga = totalharga + (jumlah*harga);
                
        }
        System.out.println("Jumlah item seluruhnya adalah : " + jumlahitem);
        
        System.out.println("Total seluruh harga : " + totalharga);
}
}
}