package Praktikum_05;

import java.util.Scanner;

public class DosenMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen17 pengelola = new dataDosen17();
        int pilih;

        do {
            System.out.println("\n=== MENU MANAJEMEN DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Seluruh Data Dosen");
            System.out.println("3. Urutkan Usia Ascending (Bubble Sort)");
            System.out.println("4. Urutkan Usia Descending (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Kode Dosen    : "); String kd = sc.next();
                    System.out.print("Nama Dosen    : "); sc.nextLine(); 
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (P/W): "); char jkChar = sc.next().charAt(0);
                    boolean jk = (jkChar == 'P' || jkChar == 'p');
                    System.out.print("Usia          : "); int usia = sc.nextInt();
                    
                    Dosen17 d = new Dosen17(kd, nama, jk, usia);
                    pengelola.tambah(d);
                    break;
                case 2:
                    pengelola.tampilSeluruhData();
                    break;
                case 3:
                    pengelola.bubbleSortUsiaAscending();
                    pengelola.tampilSeluruhData();
                    break;
                case 4:
                    pengelola.selectionSortUsiaDescending();
                    pengelola.tampilSeluruhData();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
        sc.close();
    }
}
