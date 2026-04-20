package CM1;  

public class Peminjaman17 {
    Mahasiswa17 mhs;
    Buku17 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman17(Mahasiswa17 mhs, Buku17 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    private void hitungDenda() {
        if ( lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000; 
        } else {
            terlambat = 0;
            denda = 0;
        }
    }
}
