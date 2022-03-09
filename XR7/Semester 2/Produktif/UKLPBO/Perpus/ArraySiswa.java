package UKLPBO.Perpus;

import java.util.ArrayList;

public class ArraySiswa implements GetInfo {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
//    private ArrayList<String> pinjam = new ArrayList<String>();

    public ArraySiswa(){
        this.idSiswa.add(1);
        this.namaSiswa.add("Nayo");
        this.alamat.add("Nganjuk");
        this.telepon.add("081252255258");
        this.status.add(true);
//        this.pinjam.add("");

        this.idSiswa.add(2);
        this.namaSiswa.add("Zizi");
        this.alamat.add("Nganjuk");
        this.telepon.add("085851547479");
        this.status.add(true);
//        this.pinjam.add("");
    }

    public int getJmlSiswa(){
        return this.namaSiswa.size();
    }
    public boolean getStatus(int idSiswa){
        return this.status.get(idSiswa);
    }
    public void editStatus(int idSiswa, Boolean status){
        this.status.set(idSiswa, status);
    }
    public int getid(int id){
        return this.idSiswa.get(id);
    }

//    public void setPinjam(int idsiswa, int idbook){
//        String ipinjam = "";
//        for (int i = 0; i < getJmlSiswa(); i++) {
//            if (idsiswa == 1 || idsiswa == 2 && idbook == 0) {
//                ipinjam = "Kimia";
//                this.pinjam.add(ipinjam);
//            }else if (idsiswa == 1 || idsiswa == 2 && idbook == 1){
//                ipinjam = "Fisika";
//                this.pinjam.add(ipinjam);
//            }
//        }
//    }

//    public void editPinjam(int idsiswa, int idbook){
//        for (int i = 0; i < getJmlSiswa(); i++) {
//            if (idsiswa == getid(i) && idbook == 0) {
//                this.pinjam.add("");
//            }else if (idsiswa == getid(i) && idbook == 1){
//                this.pinjam.add("");
//            }
//        }
//    }

//    public String getPinjam(int id){
//        return this.pinjam.get(id);
//    }

    @Override
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPeminjam) {
        return this.namaSiswa.get(idPeminjam);
    }

    @Override
    public String getAlamat(int idAlamat) {
        return this.alamat.get(idAlamat);
    }

    @Override
    public String getTelepon(int idTelepon) {
        return this.telepon.get(idTelepon);
    }
}
