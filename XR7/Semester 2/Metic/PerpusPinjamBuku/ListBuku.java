package PerpusPinjamBuku;

public class ListBuku {
    //menambahkan listbuku ke class Buku method Buku
    Buku[] listBuku = {
        new Buku(1, "Matematika", 20),
        new Buku(2, "Fisika", 15),
        new Buku(3, "Kimia", 43)
    };

    //mengeluarkan list buku
    public void iBuku(){
        System.out.println("===== List Buku =====");
        System.out.println("ID");
        for (int i = 0; i < listBuku.length; i++){
            System.out.println(listBuku[i].getIdBuku() + "\t" + listBuku[i].getJudulBuku() + "\t" + listBuku[i].getStok());
        }
    }

    public int caribuku(int id) {
        int ketemu = 0;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku() == id) {
                ketemu = i; //menyimpan data buku
            }
        }
        return ketemu;
    }
}
