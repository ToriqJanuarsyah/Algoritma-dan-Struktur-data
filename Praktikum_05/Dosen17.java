package Praktikum_05;

public class Dosen17 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    Dosen17(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = (jenisKelamin) ? "Pria" : "Wanita";
        System.out.printf("| %-6s | %-20s | %-12s | %-4d |\n", kode, nama, jk, usia);
    }
}