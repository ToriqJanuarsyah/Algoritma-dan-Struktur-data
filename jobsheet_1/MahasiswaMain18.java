package jobsheet_1;

public class MahasiswaMain18 {

public static void main (String[] args) {
    Mahasiswa18 mhs1 = new Mahasiswa18();
    mhs1.nama = "Muhammad Ali Farhan";
    mhs1.nim = "2231720171";
    mhs1.kelas = "SI 2J";
    mhs1.ipk = 3.55;
    
    mhs1.tampilkanInformasi();
    mhs1.ubahkelas("SI 2K");
    mhs1.updateIpk(3.60);
    mhs1.tampilkanInformasi();

    Mahasiswa18 mhs2 = new Mahasiswa18("Annisa Nabila", "2241720171", 3.20, "SI 2J");
    mhs2.updateIpk(3.30);
    mhs2.tampilkanInformasi();
}
}