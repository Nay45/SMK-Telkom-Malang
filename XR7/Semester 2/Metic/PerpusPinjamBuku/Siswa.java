package PerpusPinjamBuku;

public class Siswa {
    private int idSiswa;
    private String nama;
    private String alamat;
    private String telepon;
    boolean status;

    public Siswa(int idSiswa, String nama, String alamat, String telepon, boolean status) {
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
    }

    //mendapatkan id siswa
    public int getIdSiswa() {
        return idSiswa;
    }

    //mendapatkan nama
    public String getNama() {
        return nama;
    }

    //mendapatkan alamat
    public String getAlamat() {
        return alamat;
    }

    //mendapatkan telepon
    public String getTelepon() {
        return telepon;
    }

    //mengubah status
    public void changeStatus(){
        this.status = !this.status;
    }

    //status new
    public String getStatus() {
        if (status) {
            return "Diijinkan meminjam";
        }
        else{
            return "Tidak Diijinkan meminjam";
        }
    }

    //status masuk
    public boolean isStatus() {
        return status;
    }

}
