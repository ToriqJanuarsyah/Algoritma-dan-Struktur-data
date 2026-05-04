package jobsheet9;

public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa17(String nama, String nim, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1; 
    }
    

    void tugasDinilai (int nilai) {
        this.nilai = nilai;
    }
}

