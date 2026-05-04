package jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        StackTugasMahasiswa17 stack = new StackTugasMahasiswa17(5);
        Scanner scanner = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Paling Bawah");
            System.out.println("6. Menghitung Jumlah Tugas");
            System.out.print("Pilih: ");
            pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scanner.nextLine();
                    Mahasiswa17 mhs = new Mahasiswa17(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa17 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scanner.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa17 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa17 lihatBawah = stack.peekBottom();
                    if (lihatBawah != null) {
                        System.out.println("Tugas paling bawah dikumpulkan oleh " + lihatBawah.nama);
                    }
                    break;
                case 6:
                    int jumlahTugas = stack.count();
                    System.out.println("Jumlah tugas yang dikumpulkan: " + jumlahTugas);
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih antara 1-6.");
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}