package jobsheet_2_Object;

public class MataKuliah18 {
    String kodeMK;
    String namaMK;
    int SKS;
    int jumlahJam;

     public MataKuliah18() { 
     }   

    public MataKuliah18(String kodeMK, String namaMK, int SKS, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.SKS = SKS;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah  : " + kodeMK);
        System.out.println("Nama Mata Kuliah  : " + namaMK);
        System.out.println("SKS               : " + SKS);
        System.out.println("Jumlah Jam        : " + jumlahJam);
    }

    void ubahSKS(int SKSBaru) { 
            SKS = SKSBaru;
       System.out.println("SKS berhasil diubah menjadi: " + SKS);
    }
    
    void tambahJam(int jamTambahan) { 
        jumlahJam += jamTambahan;
        System.out.println("Jumlah jam berhasil ditambahkan. Total jam sekarang : " + jumlahJam);
    }

    void kurangjam (int jamPengurangan) { 
        if (jumlahJam - jamPengurangan >= 0) {
            jumlahJam -= jamPengurangan;
            System.out.println("Jumlah jam berhasil dikurangi. Total jam sekarang   : " + jumlahJam + "\n");
        } else {
            System.out.println("Pengurangan jam gagal. Jumlah jam tidak boleh negatif.\n");
        }
    }
}
