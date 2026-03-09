package Praktikum_03;
import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa18[] arrayOfMahasiswa = new Mahasiswa18[3];
        String dummy;

        for(int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa18();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM: ");
            arrayOfMahasiswa[i].nim = scanner.nextLine();
            System.out.print("Masukkan Nama: ");
            arrayOfMahasiswa[i].nama = scanner.nextLine();
            System.out.print("Masukkan Kelas: ");
            arrayOfMahasiswa[i].kelas = scanner.nextLine();
            System.out.print("Masukkan IPK: ");
            dummy = scanner.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------------");
        }
        for( int i = 0; i < 3; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("-----------------------------------------");
        }
    }
}
