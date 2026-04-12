package Praktikum_05;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();
        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.next();
            System.out.print("Nama  : ");
            String nama = sc.next();
            System.out.print("Kelas : ");
            String kelas = sc.next();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.next());

            Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data sebelum sorting : ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION DESCENDING SORT (ASC) : ");
        list.insertionDescending();
        list.tampil();
    }
}
