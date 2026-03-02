package jobsheet_2_Object;

public class Dosen18 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    
    public Dosen18() {
    }

    public Dosen18(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanInformasi() {
        System.out.println("ID Dosen         : " + idDosen);
        System.out.println("Nama             : " + nama);
        System.out.println("Status Aktif     : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung  : " + tahunBergabung);
        System.out.println("Bidang Keahlian  : " + bidangKeahlian);
    }

    void ubahStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
        System.out.println("Status aktif dosen berhasil diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        return masaKerja;
    }

    void ubahkeahilan(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
        System.out.println("Bidang keahlian dosen berhasil diubah menjadi: " + bidangKeahlian + "\n");
    }
}
