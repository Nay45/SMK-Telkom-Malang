package PerpusPinjamBuku;

public class ListSiswa {
    Siswa[] listSiswa = {
            new Siswa(1, "Nayo", "Nganjuk", "001", true),
            new Siswa(1, "Zizi", "Nganjuk", "002", true),
            new Siswa(1, "Nayo", "Nganjuk", "003", true)
    };

    //list siswa
    public void iSiswa(){
        System.out.println("===== List Siswa =====");
        System.out.println("ID");
        for (int i = 0; i < listSiswa.length; i++){
            System.out.println(listSiswa[i].getIdSiswa() + "\t" +
                    listSiswa[i].getNama() + "\t" +
                    listSiswa[i].getAlamat() + "\t" +
                    listSiswa[i].getTelepon() + "\t" +
                    listSiswa[i].getStatus());
        }
    }

    public int cariSiswa(int id){
        int ketemu = 0;
        for (int i = 0; i < listSiswa.length; i++) {
            if (listSiswa[i].getIdSiswa() == id) {
                ketemu = i; //menyimpan data siswa
            }
        }
        return ketemu;
    }
}
