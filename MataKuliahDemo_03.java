import java.util.Scanner;
public class MataKuliahDemo_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data matkul: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        MataKuliah_03[] arrayOfMataKuliah_03 = new MataKuliah_03[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan mata kuliah ke-" + (i + 1));
            System.out.print("Kode MK: ");
            String kodeMK = sc.nextLine();

            System.out.print("Nama MK: ");
            String namaMK = sc.nextLine();

            System.out.print("SKS: ");
            int sks = Integer.parseInt(sc.nextLine());

            System.out.println("===========================");
            arrayOfMataKuliah_03[i] = new MataKuliah_03(kodeMK, namaMK, sks, jumlah);
        }

        System.out.println("\n========Data Mata Kuliah=======");
        for (int i = 0; i < jumlah; i++) {
            arrayOfMataKuliah_03[i].tampilkanInfo();
        }

        System.out.println("\n=======Ubah Nama MK=======");
        System.out.print("Masukkan nama MK baru: ");
        String namaMkBaru = sc.nextLine();
        arrayOfMataKuliah_03[0].ubahNamaMK(null);;

        System.out.println("\n=======Ubah SKS=======");
        System.out.print("Masukkan SKS baru: ");
        int sksBaru = Integer.parseInt(sc.nextLine());
        arrayOfMataKuliah_03[0].ubahSKS(sksBaru);

        System.out.println("\n=======Data Baru=======");
        arrayOfMataKuliah_03[0].tampilkanInfo();
    }
}
