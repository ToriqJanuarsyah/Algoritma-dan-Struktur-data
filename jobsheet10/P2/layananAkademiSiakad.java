import java.util.Scanner;

public class layananAkademiSiakad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianLayanan17 antrian = new AntrianLayanan17(5); 
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Mahasiswa Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (antrian.IsFull()) {
                        System.out.println("Antrian sudah penuh, tidak bisa menambahkan mahasiswa.");
                    } else {
                        System.out.print("NIM   : ");
                        String nim = scanner.nextLine();
                        System.out.print("Nama  : ");
                        String nama = scanner.nextLine();
                        System.out.print("Prodi : ");
                        String prodi = scanner.nextLine();
                        System.out.print("Kelas : ");
                        String kelas = scanner.nextLine();
                        Mahasiswa17 mhs = new Mahasiswa17(nim, nama, prodi, kelas);
                        antrian.tambahAntrian(mhs);
                    }
                    break;
                case 2:
                    Mahasiswa17 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani Mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                     break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        scanner.close();
    }
}
