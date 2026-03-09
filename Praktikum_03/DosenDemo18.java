package Praktikum_03;
import java.util.Scanner;

public class DosenDemo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dosen18[] arrayOfDosen = new Dosen18[3];
        
        for(int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = scanner.nextLine();
            System.out.print("Nama       : ");
            String nama = scanner.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisKelamin = scanner.nextLine();
            System.out.print("Usia       : ");
            int usia = Integer.parseInt(scanner.nextLine());
            System.out.println("-----------------------------");

            arrayOfDosen[i] = new Dosen18(kode, nama, jenisKelamin, usia);
        }

    DataDosen18 dataDosen = new DataDosen18();
    dataDosen.dataSemuaDosen(arrayOfDosen);
    dataDosen.jumlahDosenPerjenisKelamin(arrayOfDosen);
    dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
    dataDosen.infoDosenPalingTua(arrayOfDosen);
    dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
    
}
