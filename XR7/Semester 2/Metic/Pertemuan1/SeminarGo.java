package Pertemuan1;

public class SeminarGo {
    public static void main(String[] args) {
        // Membuat object maxPenumpang
        Seminar people = new Seminar(5);

        // Nilai param tinggi
        people.getAudience(170);
        people.getAudience(160);

        people.cetak();

        people.addAudience(1); //tambah 1 penumpang
        people.cetak();

        people.addAudience(2); //tambah 2 penumpang
        people.cetak();

        people.addAudience(3); //tambah 3 penumpang
        people.cetak();
    }
}
