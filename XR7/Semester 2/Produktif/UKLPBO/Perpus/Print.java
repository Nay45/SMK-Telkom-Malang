package UKLPBO.Perpus;

public class Print {
    public void cetak(Buku buku){
        int x = buku.getJmlBuku();

        System.out.println("===== List Buku =====");
        System.out.println("Id" + "\t" + "Judul" + "\t" + "Stok" + "\t" + "Harga");
        for (int i = 0; i < x; i++){
            System.out.println(buku.getid(i) + "\t" + buku.getNamaBuku(i) + "\t" + buku.getStok(i) + "\t" + buku.getHarga(i));
        }
    }

    public void cetak(ArraySiswa arraySiswa){
        int x = arraySiswa.getJmlSiswa();

        System.out.println("===== List Siswa =====");
        System.out.println("Id" + "\t" + "Nama" + "\t" + "Alamat" + "\t\t" + "Nomor" + "\t\t" + "Status");
        for (int i = 0; i < x; i++){
            System.out.println(arraySiswa.getid(i) + "\t" + arraySiswa.getNama(i) + "\t" + arraySiswa.getAlamat(i) + "\t" + arraySiswa.getTelepon(i) + "\t" + arraySiswa.getStatus(i));
        }
    }
}
