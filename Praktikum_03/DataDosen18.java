package Praktikum_03;

public class DataDosen18 {
    public void dataSemuaDosen(Dosen18[] arrayOfDosen) {
        System.out.println("====== data semua dosen ======");
        for(Dosen18 dosen : arrayOfDosen) {
            System.out.println("Kode       : " + dosen.kode);
            System.out.println("Nama       : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + dosen.jenisKelamin);
            System.out.println("Usia       : " + dosen.usia);
            System.out.println("-----------------------------");
        }
    }

    public void jumlahDosenPerjenisKelamin(Dosen18[] arrayOfDosen) {
        int Pria = 0;
        int Wanita = 0;

        for(Dosen18 dosen : arrayOfDosen) {
            if(dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                Pria++;
            } else if(dosen.jenisKelamin.equalsIgnoreCase("Wanita")) {
                Wanita++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki : " + Pria);
        System.out.println("Jumlah Dosen Perempuan : " + Wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen18[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int countPria = 0;
        int countWanita = 0;

        for(Dosen18 dosen : arrayOfDosen) {
            if(dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else if(dosen.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        double rerataUsiaPria = (countPria > 0) ? (double) totalUsiaPria / countPria : 0;
        double rerataUsiaWanita = (countWanita > 0) ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("Rerata Usia Dosen Laki-laki : " + rerataUsiaPria);
        System.out.println("Rerata Usia Dosen Perempuan : " + rerataUsiaWanita);
    }

    public void infoDosenPalingTua(Dosen18[] arrayOfDosen) {
        Dosen18 dosenTua = arrayOfDosen[0];

        for(Dosen18 dosen : arrayOfDosen) {
            if(dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }
        System.out.println("Dosen Tertua:");
        System.out.println("Kode       : " + dosenTua.kode);
        System.out.println("Nama       : " + dosenTua.nama);
        System.out.println("Jenis Kelamin : " + dosenTua.jenisKelamin);
        System.out.println("Usia       : " + dosenTua.usia);
    }

    public void infoDosenPalingMuda(Dosen18[] arrayOfDosen) {
        Dosen18 dosenMuda = arrayOfDosen[0];

        for(Dosen18 dosen : arrayOfDosen) {
            if(dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }
        System.out.println("Dosen Termuda:");
        System.out.println("Kode       : " + dosenMuda.kode);
        System.out.println("Nama       : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin : " + dosenMuda.jenisKelamin);
        System.out.println("Usia       : " + dosenMuda.usia);
    }
}