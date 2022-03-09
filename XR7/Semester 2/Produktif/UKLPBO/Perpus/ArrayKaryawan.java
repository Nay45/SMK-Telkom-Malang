package UKLPBO.Perpus;

import java.util.ArrayList;

public class ArrayKaryawan implements GetInfo{
    private ArrayList<String> karyawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public ArrayKaryawan(){
        this.karyawan.add("Admin");
        this.alamat.add("Namex");
        this.telepon.add("08********22");
    }

    public int getJmlKaryawan(){
        return this.karyawan.size();
    }

    @Override
    public void setNama(String namaKaryawan){
        this.karyawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat ){
        this.karyawan.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.karyawan.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan){
        return this.karyawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan){
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan){
        return this.telepon.get(idKaryawan);
    }
}
