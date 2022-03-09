package UKLPBO.Perpus;

import java.util.ArrayList;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            boolean progres = true;
            String key;
            Buku selectedBuku;
            ArraySiswa arraySiswa = new ArraySiswa();
            Buku buku = new Buku();
            ArrayKaryawan arrayKaryawan = new ArrayKaryawan();
            Print print = new Print();

        while (progres) {
            System.out.println("---- Library ----");
            System.out.println("1. List Buku");
            System.out.println("2. List Siswa");
            System.out.println("3. Pinjam/Kembalikan");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            if (menu == 1) {
                System.out.println();
                System.out.println("---------------------------\n");

                // menampilkan daftar buku
                print.cetak(buku);
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 2) {
                System.out.println();
                System.out.println("---------------------------\n");

                //menampilkan daftar siswa
                print.cetak(arraySiswa);
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 3) {
                System.out.println();
                System.out.println("---------------------------\n");
                System.out.println("---- Peminjaman Buku / Pengembalian ----");

                int temp;

                System.out.print("Masukkan id siswa : ");
                int selectedIDSiswa = input.nextInt();

                selectedIDSiswa -= 1;

                ArrayList<Integer> idBuku = new ArrayList<Integer>();

                int i = 0;
                temp = 0;

                System.out.print("Masukkan id Buku : ");
                temp = input.nextInt();

                temp -= 1;



                    if (temp != 99 && arraySiswa.getStatus(selectedIDSiswa) == true) {
                        idBuku.add(temp);
                        System.out.print(buku.getNamaBuku(idBuku.get(i)) + " sebanyak : ");
                        int banyak = input.nextInt();
                        int itemp = idBuku.get(0);

                        if (itemp == 0 && banyak <= buku.getStok(0)) {
                            buku.minStok0(banyak);
                            arraySiswa.editStatus(selectedIDSiswa, false);
//                            arraySiswa.setPinjam(selectedIDSiswa, itemp);
                        } else if (itemp == 1 && banyak <= buku.getStok(1)) {
                            buku.minStok1(banyak);
                            arraySiswa.editStatus(selectedIDSiswa, false);
//                            arraySiswa.setPinjam(selectedIDSiswa, itemp);
                        } else {
                            System.out.println("Stok buku hanya ada sekian");
                            int x = buku.getJmlBuku();
                            System.out.println("Id" + "\t" + "Judul" + "\t" + "Stok" + "\t" + "Harga");
                            for (int b = 0; b < x; b++) {
                                System.out.println(buku.getid(b) + "\t" + buku.getNamaBuku(b) + "\t" + buku.getStok(b) + "\t" + buku.getHarga(b));
                            }
                            System.out.println("Press any key and enter...");
                            key = input.next();
                        }

                        System.out.println("Id Siswa : " + arraySiswa.getid(selectedIDSiswa));
                        System.out.println("Nama : " + arraySiswa.getNama(selectedIDSiswa));
                        System.out.println("Alamat : " + arraySiswa.getAlamat(selectedIDSiswa));
                        System.out.println("Nomor : " + arraySiswa.getTelepon(selectedIDSiswa));
                        System.out.println("Status terbaru : " + arraySiswa.getStatus(selectedIDSiswa));

                    } else if (arraySiswa.getStatus(selectedIDSiswa) == false) {
                        System.out.print("Siswa Telah meminjam!");
                        System.out.print("\nApakah anda ingin mengembalikan buku ? y/n : ");
                        key = input.next();
                        if (key.equalsIgnoreCase("Y")) {
                            arraySiswa.editStatus(selectedIDSiswa, true);
                            buku.Stokmula();
                        }
                        System.out.println("Id Siswa : " + arraySiswa.getid(selectedIDSiswa));
                        System.out.println("Nama : " + arraySiswa.getNama(selectedIDSiswa));
                        System.out.println("Alamat : " + arraySiswa.getAlamat(selectedIDSiswa));
                        System.out.println("Nomor : " + arraySiswa.getTelepon(selectedIDSiswa));
                        System.out.println("Status terbaru : " + arraySiswa.getStatus(selectedIDSiswa));
                    }
                } else if (menu == 4) {
                    //variabel "progres" diset false menyebabkan program berhenti
                    progres = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Terdapat Exception! \n Info : " + e.getMessage());
        }
    }
}