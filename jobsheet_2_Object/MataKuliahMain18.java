package jobsheet_2_Object;

public class MataKuliahMain18 {
    public static void main(String[] args) {
        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMK = "RTI252008";
        mk1.namaMK = "Algoritma dan Struktur Data";
        mk1.SKS = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(5);
        mk1.kurangjam(2);

        MataKuliah18 mk2 = new MataKuliah18("RTI252009", "Basis Data", 3, 6);
        mk2.tampilkanInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(3); 
        mk2.kurangjam(1);
    }
}
