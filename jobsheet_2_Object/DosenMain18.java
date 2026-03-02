package jobsheet_2_Object;

public class DosenMain18 {
    public static void main(String[] args) {
        Dosen18 dosen1 = new Dosen18();
        dosen1.idDosen = "D001";
        dosen1.nama = "budiono siregar";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Basis Data";
        
        dosen1.tampilkanInformasi();
        dosen1.ubahStatusAktif(false);
        int masaKerjaDosen1 = dosen1.hitungMasaKerja(2026);
        System.out.println("Masa kerja dosen : " + masaKerjaDosen1 + " tahun");
        dosen1.ubahkeahilan("Sistem Operasi");

        Dosen18 dosen2 = new Dosen18("D002", "siti nurjanah", true, 2015, "Aljabar Linier");
        dosen2.tampilkanInformasi();
        dosen2.ubahStatusAktif(true);
        int masaKerjaDosen2 = dosen2.hitungMasaKerja(2026);
        System.out.println("Masa kerja dosen : " + masaKerjaDosen2 + " tahun");
        dosen2.ubahkeahilan("Matematika Diskrit");
    }
}
