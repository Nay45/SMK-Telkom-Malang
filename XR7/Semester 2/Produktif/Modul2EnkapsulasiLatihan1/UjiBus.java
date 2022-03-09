package Modul2EnkapsulasiLatihan1;

public class UjiBus {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini=new Bus(10);

        busMini.pluspenumpang(4);
        busMini.getPassword(40);
        busMini.getPassword(90);

        busMini.getAudience(67);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();


    }

}