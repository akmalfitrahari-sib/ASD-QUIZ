public class Dosen_03 {

    String nidn, nama, jenjangPendidikan, prodi;
    int tahunMasuk;

    public Dosen_03 (String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
        this.tahunMasuk = tahunMasuk;
    }

    void tampilkanInfo () {
        System.out.println("Nidn         : " + nidn);
        System.out.println("Nama         : " + nama);
        System.out.println("Tahun Masuk  : " + tahunMasuk);
        System.out.println("JenjangPendidikan : " + jenjangPendidikan);
        System.out.println("Prodi        : " + prodi);
        System.out.println("------------------------------------");
    }

    public void ubahProdi (String prodiBaru) {
        prodi = prodiBaru;
    }

    public void ubahPendidikan (String pendidikanBaru) {
        jenjangPendidikan = pendidikanBaru;
    }
}