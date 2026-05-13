package jobsheet10.Tugas;

public class AntrianKRS17 {
    Mahasiswa17[] mhs;
    int front;
    int rear;
    int size;
    int max;
    int totalSudahKRS = 0; 
    int targetDPA = 30; 

    public AntrianKRS17(int n) {
        max = n;
        mhs = new Mahasiswa17[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa17 m) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            rear = (rear + 1) % max;
            mhs[rear] = m;
            size++;
            System.out.println(m.nama + " berhasil masuk antrian.");
        }
    }

    public void layaniKRS() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            int jumlahPanggilan;
            if (size >= 2) {
                jumlahPanggilan = 2;
            } else {
                jumlahPanggilan = 1;
            }

            System.out.println("--- Memproses KRS ---");
            for (int i = 0; i < jumlahPanggilan; i++) {
                System.out.println("Melayani: " + mhs[front].nama + " (" + mhs[front].nim + ")");
                front = (front + 1) % max;
                size--;
                totalSudahKRS++;
            }
            System.out.println("---------------------");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar mahasiswa dalam antrian: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                mhs[index].tampilkanData();
            }
        }
    }

    public void lihat2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("2 Antrian Terdepan:");
            System.out.print("1. ");
            mhs[front].tampilkanData();
            if (size >= 2) {
                int kedua = (front + 1) % max;
                System.out.print("2. ");
                mhs[kedua].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Antrian paling akhir: ");
            mhs[rear].tampilkanData();
        }
    }

    public void statistikKRS() {
        int belumKRS = targetDPA - totalSudahKRS;
        System.out.println("Jumlah antrian saat ini     : " + size);
        System.out.println("Total sudah proses KRS      : " + totalSudahKRS);
        System.out.println("Mahasiswa DPA belum proses  : " + belumKRS);
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}