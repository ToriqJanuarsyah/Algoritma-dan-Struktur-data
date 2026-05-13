package jobsheet10.Tugas;

import java.util.Scanner;

public class MainKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS17 antrian = new AntrianKRS17(10); 
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian (2 Mahasiswa)");
            System.out.println("3. Lihat 2 Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Statistik KRS");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : "); 
                    String nim = sc.nextLine();
                    System.out.print("Nama  : "); 
                    String nama = sc.nextLine();
                    System.out.print("Prodi : "); 
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : "); 
                    String kelas = sc.nextLine();
                    Mahasiswa17 mhs = new Mahasiswa17(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.layaniKRS();
                    break;
                case 3:
                    antrian.lihat2Terdepan();
                    break;
                case 4:
                    antrian.lihatAkhir();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    antrian.statistikKRS();
                    break;
                case 7:
                    antrian.clear();
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}