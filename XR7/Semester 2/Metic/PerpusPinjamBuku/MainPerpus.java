package PerpusPinjamBuku;

import java.util.Scanner;

public class MainPerpus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean stay = true;

        String key;

        ListBuku listBuku = new ListBuku();

        ListSiswa listSiswa = new ListSiswa();

        Buku selectedbook = null;

        while (stay){
            System.out.println("---- Library ---");
            System.out.println("1. List Buku");
            System.out.println("2. List Siswa");
            System.out.println("3. Transaksi");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            if (menu == 1) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");

                // menampilkan daftar buku
                listBuku.iBuku();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 2) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");

                //menampilkan daftar siswa
                listSiswa.iSiswa();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 3) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                System.out.println("--- Peminjaman Buku ---");

                /** variabel "selectedIDSiswa" utk menyimpan data id siswa yg dipilih,
                 * variabel "selectedIDBuku" utk menyimpan data id buku yg dipilih
                 */
                int selectedIDSiswa, selectedIDBuku;

                System.out.print("Masukkan ID Siswa: ");
                selectedIDSiswa = input.nextInt();

                //"foundIndex" menyimpan posisi index dari data siswa yg dipilih
                int foundIndex = listSiswa.cariSiswa(selectedIDSiswa);

                //"selectedSiswa" menyimpan data client yg dipilih
                Siswa selectedSiswa = listSiswa.listSiswa[foundIndex];

                //Logika percabangan, jika true --> lanjut
                if (selectedSiswa.isStatus()) {
                    //proses perubahan status siswa
                    listSiswa.listSiswa[foundIndex].changeStatus();

                    //menampilkan data buku
                    listBuku.iBuku();

                    System.out.print("Pilih ID buku yang dipinjam: ");
                    selectedIDBuku = input.nextInt();
                    foundIndex = listBuku.caribuku(selectedIDBuku);

                    //"selectedBuku" menyimpan data client yg dipilih
                    selectedbook = listBuku.listBuku[foundIndex];

                    System.out.println("--- List Peminjaman ---");
                    System.out.println("Judul Buku: " + selectedbook.getJudulBuku());
                    System.out.println("Peminjam: " + selectedSiswa.getNama());

                    //proses pengurangan stok
                    listBuku.listBuku[foundIndex].kurangiStok();


                } else {
                    System.out.println("Maaf anda masih punya tanggungan buku");
                    System.out.print("Apakah anda ingin mengembalikan buku ? y/n : ");
                    key = input.next();
                    if (key.equalsIgnoreCase("Y") ) {
                        selectedSiswa.changeStatus();
                        assert selectedbook != null;
                        selectedbook.tambahStock();
                    }
                }

            } else if (menu == 4) {
                //variabel "stay" diset false menyebabkan program berhenti
                stay = false;
            }
        }
    }
        }
