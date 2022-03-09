package Bola;

/**
 * Math pow adalah operasi math yang berfungsi sebagia perpangkatan Math.POW (4,2) : 4 pangkat 2\
 * MthPI adalah operasi math yang berfungsi sebagai nilai phi yaitu 3,14
 */

public class Bola {
    // Deklarasi
    private double jarijari;

    // constructor jari jari
    public Bola(double jarijari){
        this.jarijari = jarijari;
    }


    // Setter | mengisi nilai pada variabe/
    public void setJarijari(double jarijari){
        this.jarijari=jarijari;
    }

    // Method menampilak Diameter
    public void showDiameter(){ //output dan proses diameter
        System.out.println("Diameter Bola.Bola : " + 2*jarijari);
    }

    // Method menampilkan luas permukaan bola
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan Bola.Bola : " + (4/3*Math.pow(jarijari,3)));
    }

    // Method menampilkan volume bola
    public void showVolume(){ //outout dan proses volume
        System.out.println("Volume Bola.Bola : " + (4*Math.PI*Math.pow(jarijari,2)));
    }
}