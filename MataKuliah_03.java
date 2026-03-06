public class MataKuliah_03 {
    String kodeMK, namaMK;
    int sks;
    Dosen_03[] dosenPengampu;
    int jumlahDosen = 0;

    public MataKuliah_03 (String kodeMK, String namaMk, int sks, int jumlahDosenMax) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMk;
        this.sks = sks;
        dosenPengampu = new Dosen_03[jumlahDosenMax];
    }

     public void tampilkanInfo () {
        System.out.println("KodeMK       : " + kodeMK);
        System.out.println("NamaMK       : " + namaMK);
        System.out.println("Sks          : " + sks);
        System.out.println("Daftar dosen pengampu   : ");
        for (int i = 0; i < jumlahDosen; i++) {
            dosenPengampu[i].tampilkanInfo();
        }
        System.out.println("------------------------------------");
    }

    public void ubahNamaMK (String namaMkBaru) {
        namaMK = namaMkBaru;
    }

    public void ubahSKS (int SKS) {
        if (SKS >= 2) {
            sks = SKS;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2");
        }
    }

    public void tambahDosen (Dosen_03 dosen) {
        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen] = dosen;
            jumlahDosen++;
        } else {
            System.out.println("Dosen sudah penuh");
        }
    }

}

