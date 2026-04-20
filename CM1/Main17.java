package CM1;

import java.util.Scanner;

public class Main17 {

    public static void bubbleSortNIM(Peminjaman17[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].mhs.nim.compareTo(data[j + 1].mhs.nim) > 0) {
                    Peminjaman17 temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearchNIM(Peminjaman17[] data, String key) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = data[mid].mhs.nim.compareTo(key);

            if (cmp == 0) {
                return mid; 
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa17[] mhs = {
            new Mahasiswa17("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa17("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa17("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku17[] buku = {
            new Buku17("B001", "Algoritma", 2020),
            new Buku17("B002", "Basis Data", 2019),
            new Buku17("B003", "Pemrograman", 2021),
            new Buku17("B004", "Fisika", 2024)
        };

        Peminjaman17[] dataPinjam = {
            new Peminjaman17(mhs[0], buku[0], 7),
            new Peminjaman17(mhs[1], buku[1], 3),
            new Peminjaman17(mhs[2], buku[2], 10),
            new Peminjaman17(mhs[2], buku[3], 6),
            new Peminjaman17(mhs[0], buku[1], 4)
        };

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN UANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Pemnjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa17 m : mhs) {
                        System.out.println("NIM: " + m.nim + " | Nama: " + m.nama + " | Prodi: " + m.prodi);
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku17 b : buku) {
                        System.out.println("Kode: " + b.KodeBuku + " | Judul: " + b.JudulBuku + " | Tahun: " + b.TahunTerbit);
                    }
                    break;
                case 3:
                    System.out.println("\nDaftar Peminjaman:");
                    for (Peminjaman17 p : dataPinjam) {
                        System.out.println("Mahasiswa: " + p.mhs.nama + " | Buku: " + p.buku.JudulBuku + " | Lama Pinjam: " + p.lamaPinjam + " hari | Terlambat: " + p.terlambat + " hari | Denda: Rp" + p.denda);
                    }
                    break;
                case 4:
                    System.out.println("\nSetelah diurutkan (Denda terbesar): ");
                   for (int i = 1; i < dataPinjam.length; i++) {
                        Peminjaman17 key = dataPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && dataPinjam[j].denda < key.denda) {
                            dataPinjam[j + 1] = dataPinjam[j];
                            j--;
                        }
                        dataPinjam[j + 1] = key;
                    }
                    for (Peminjaman17 p : dataPinjam) {
                        System.out.println("Mahasiswa: " + p.mhs.nama + " | Buku: " + p.buku.JudulBuku + " | Lama Pinjam: " + p.lamaPinjam + " hari | Terlambat: " + p.terlambat + " hari | Denda: Rp" + p.denda);
                    }
                    break;
                case 5:
                    bubbleSortNIM(dataPinjam);
                    System.out.print("Masukkan NIM: ");
                    String searchNIM = sc.next();
                    int index = binarySearchNIM(dataPinjam, searchNIM);
                    if (index != -1) {
                        Peminjaman17 p = dataPinjam[index];
                        System.out.println("Mahasiswa: " + p.mhs.nama + " | Buku: " + p.buku.JudulBuku + " | Lama Pinjam: " + p.lamaPinjam + " hari | Terlambat: " + p.terlambat + " hari | Denda: Rp" + p.denda);
                    } else {
                         System.out.println("NIM tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}   
   

