import java.util.Scanner;
public class DosenDemo_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Dosen_03[] arrayOfDosen_03 = new Dosen_03[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("NIDN: ");
            String nidn = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("tahun masuk: ");
            int tahunMasuk = Integer.parseInt(sc.nextLine());

            System.out.print("Jenjang Pendidikan: ");
            String jenjangPendidikan = sc.nextLine();

            System.out.print("Prodi: ");
            String prodi = sc.nextLine();

            System.out.println("===========================");
            arrayOfDosen_03[i] = new Dosen_03(nidn, nama, tahunMasuk, jenjangPendidikan, prodi);
        }

        System.out.println("\n========Data Dosen=======");
        for (int i = 0; i < jumlah; i++) {
            arrayOfDosen_03[i].tampilkanInfo();
        }

        System.out.println("\n=======Ubah Prodi Dosen=======");
        System.out.print("Masukkan prodi baru: ");
        String prodiBaru = sc.nextLine();
        arrayOfDosen_03[0].ubahProdi(prodiBaru);

        System.out.println("\n=======Ubah Jenjang Pendidikan=======");
        System.out.print("Masukkan jenjang pendidikan baru: ");
        String pendidikanBaru = sc.nextLine();
        arrayOfDosen_03[0].ubahPendidikan(pendidikanBaru);

        System.out.println("\n=======Data Baru=======");
        arrayOfDosen_03[0].tampilkanInfo();
    }
}
