    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas5.progdas5;

/**
 *
 * @author USER
 */
public class TugasEvaluasi {
    public static void main(String[] args){
        int laptop, hardisk, mouse;
        int HL, HH,HM;
        laptop = 7;
        hardisk = 11;
        mouse = 21;
        HL = 10000000;
        HH = 1500000;
        HM = 150000;
        int subtotal_laptop, subtotal_hardisk, subtotal_mouse;
        int jumlah, total;
        
        subtotal_laptop = laptop*HL;
        subtotal_hardisk = hardisk*HH;
        subtotal_mouse = mouse*HM;
        
        jumlah = laptop+hardisk+mouse;
        total = subtotal_laptop + subtotal_hardisk + subtotal_mouse;
        
        System.out.println("Jumlah barang yang tersedia : " + laptop + " laptop + " + hardisk + " hardisk + " + mouse + " mouse = " + jumlah);
        System.out.println("Harga laptop : " + "Rp" + HL);
        System.out.println("Harga hardisk : " + "Rp" + HH);
        System.out.println("Harga mouse : " + "Rp" + HM);
        System.out.println("Harga total laptop : " + "Rp" + subtotal_laptop);
        System.out.println("Harga total hardisk : " + "Rp" + subtotal_hardisk);
        System.out.println("Harga total mouse : " + "Rp" + subtotal_mouse);
        System.out.println("Total seluruh harga barang yang tersedia : " + "Rp" + total);
    }
}
