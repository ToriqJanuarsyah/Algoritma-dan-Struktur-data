package jobsheet_2_Object;

public class Mahasiswa18 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa18() {
    }

    public Mahasiswa18(String nama, String nim, double ipk, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }

void tampilkanInformasi() {
    System.out.println("nama : " + nama);
    System.out.println("nim : " + nim);
    System.out.println("ipk : " + ipk);
    System.out.println("kelas : " + kelas);
}

void ubahkelas (String kelasBaru) {
    kelas = kelasBaru;
}

void updateIpk (double ipkBaru) {
    if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
    } else {
        System.out.println("Nilai IPK tidak valid. Harus antara 0.0 dan 4.0.");
    }
}

String nilaiKinerja() {
    if (ipk >= 3.5) {
        return "Kinerja Sangat Baik";
    } else if (ipk >= 3.0) {
        return "Kinerja Baik";
    } else if (ipk >= 2.5) {
        return "Kinerja Cukup";
    } else {
        return "Kinerja Kurang";
    }
}
}