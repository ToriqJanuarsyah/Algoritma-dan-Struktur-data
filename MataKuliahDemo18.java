import java.util.Scanner;

public class MataKuliahDemo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyak mata kuliah yang ingin diinput: ");
        int jumlahMatakuliah = scanner.nextInt();
        scanner.nextLine();
        MataKuliah18[] arrayOfMatakuliah = new MataKuliah18[jumlahMatakuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = scanner.nextLine();
            System.out.print("Nama       : ");
            nama = scanner.nextLine();
            System.out.print("SKS        : ");
            dummy = scanner.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = scanner.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------------");

           arrayOfMatakuliah[i] = new MataKuliah18(kode, nama, sks, jumlahJam);
        }

         arrayOfMatakuliah[2].tambahData("13579", "Aljabar Linier", 4, 4);

        System.out.println("Data mata kuliah setelah penambahan:");
        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Data mata kuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("----------------------------------------");
        }
    }
}
