package Praktikum_05;

public class dataDosen17 {
    Dosen17[] dataDosen = new Dosen17[10];
    int idx = 0;

    void tambah(Dosen17 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan.");
        } else {
            System.out.println("---------------------------");
            System.out.println("DATA SUDAH PENUH!");
            System.out.println("---------------------------");
        }
    }

    void tampilSeluruhData() {
        if (idx == 0) {
            System.out.println("Data masih kosong!");
            return;
        }
        System.out.println("============================================================");
        System.out.printf("| %-6s | %-20s | %-12s | %-4s |\n", "KODE", "NAMA", "GENDER", "USIA");
        System.out.println("============================================================");
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
        System.out.println("============================================================");
    }

    // Bubble Sort - Usia Ascending
    void bubbleSortUsiaAscending() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen17 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan Ascending (Bubble Sort).");
    }

    // Selection Sort - Usia Descending
    void selectionSortUsiaDescending() {
        for (int i = 0; i < idx - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max_idx].usia) {
                    max_idx = j;
                }
            }
            Dosen17 temp = dataDosen[max_idx];
            dataDosen[max_idx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data telah diurutkan Descending (Selection Sort).");
    }
}