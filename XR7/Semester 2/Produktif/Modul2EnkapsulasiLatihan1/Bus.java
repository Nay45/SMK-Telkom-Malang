package Modul2EnkapsulasiLatihan1;

public class Bus {
    private int penumpang,maxpenumpang, audienceBaru;
    private double beratbadanAudience;

    // konstruktor
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
        audienceBaru = 1;
    }

    //method mutator
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
            audienceBaru++;
        }

    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("pass salah");
        }
    }

    public void getAudience(int penumpang){
        this.beratbadanAudience = penumpang;
        if( beratbadanAudience >= 70 ){
            System.out.println("Berat penumpang lebih dari 70 kg " );
        }else{
            System.out.println("Tinggi penumpang dibawah 70 kg " );
        }
    }

    //     method rata rata
    public double getAverage(){
        return this.beratbadanAudience/this.penumpang;
    }

    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
        System.out.println("Rata rata berat penumpang = " + getAverage());
    }

}