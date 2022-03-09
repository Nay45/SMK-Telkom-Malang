package PerpusPinjamBuku;

public class Buku {
    private int idBuku;
    private int stok;
    private String judulBuku;

    public Buku(int idBuku, String judulBuku, int stok) {
        this.idBuku = idBuku;
        this.stok = stok;
        this.judulBuku = judulBuku;
    }

    //mendapatkan id buku
    public int getIdBuku() {
        return idBuku;
    }

    //stok yang ada
    public int getStok() {
        return stok;
    }

    //judul buku
    public String getJudulBuku() {
        return judulBuku;
    }

    //mengurangi stok
    public void kurangiStok(){
        this.stok--;
    }

    //menambah stok
    public void tambahStock(){
        this.stok++;
    }

}
