package UKLPBO.Perpus;

import java.util.ArrayList;

public class Buku {
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku(){
        this.idBuku.add(1);
        this.namaBuku.add("Kimia");
        this.stok.add(15);
        this.harga.add(20000);

        this.idBuku.add(2);
        this.namaBuku.add("Fisika");
        this.stok.add(10);
        this.harga.add(22000);
    }

    public int getJmlBuku(){
        return this.idBuku.size();
    }
    public int getid(int id){
        return this.idBuku.get(id);
    }
    public String getNamaBuku(int idBuku){
        return this.namaBuku.get(idBuku);
    }

    public int getStok(int idBuku){
        return this.stok.get(idBuku);
    }
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    }

    public void minStok0(int banyak){
        int kurang = this.stok.get(0) - banyak;
        stok.remove(0);
        stok.add(0, kurang);
    }

    public void minStok1(int banyak){
        int kurang = this.stok.get(1) - banyak;
        stok.add(1, kurang);
    }

//    public void plusStok0(int banyak){
//        int plus = this.stok.get(0) + banyak;
//        stok.remove(0);
//        stok.add(0, plus);
//    }
//
//    public void plusStok1(int banyak){
//        int plus = this.stok.get(1) + banyak;
//        stok.remove(1);
//        stok.add(1, plus);
//    }

    public void Stokmula(){
//        ArraySiswa arraySiswa = new ArraySiswa();
//
//        String pinjaman = "";
//
//        if (idbook == 0){
//            pinjaman = "Kimia";
//        }else if (idbook == 1){
//            pinjaman = "Fisika";
//        }
//
//        for (int i = 0; i < getJmlBuku(); i++) {
//            if (idsiswa == 1 || idsiswa == 2 && pinjaman.equalsIgnoreCase("Kimia")) {
//                arraySiswa.editPinjam(idsiswa, idbook);
//                plusStok0(banyak);
//            }else if (idsiswa == 1 || idsiswa == 2 && pinjaman.equalsIgnoreCase("Fisika")){
//                arraySiswa.editPinjam(idsiswa, idbook);
//                plusStok1(banyak);
//            }
//        }

        this.stok.add(0, 15);
        this.stok.add(1, 10);
    }
}
