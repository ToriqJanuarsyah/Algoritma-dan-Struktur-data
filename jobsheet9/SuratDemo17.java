package jobsheet9;

import java.util.Scanner;

public class SuratDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat17 stack = new StackSurat17(10);
        int pilih;

        do {
            System.out.println("\nMenu Layanan Surat Izin:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin (Pop)");
            System.out.println("3. Lihat Surat Izin Terakhir (Peek)");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis (S/I): "); char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): "); int dur = sc.nextInt();
                    stack.push(new Surat17(id, nama, kls, jns, dur));
                    break;
                case 2:
                    Surat17 p = stack.pop();
                    if (p != null) System.out.println("Memproses surat: " + p.namaMahasiswa);
                    break;
                case 3:
                    Surat17 t = stack.peek();
                    if (t != null) System.out.println("Surat teratas: " + t.namaMahasiswa);
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
