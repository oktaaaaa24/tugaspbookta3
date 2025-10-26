import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int gol = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int anak = input.nextInt();

        double gajiPokok = 0, tunjPasangan = 0, tunjAnak = 0;

        switch (gol) {
            case 1:
                gajiPokok = 1200000;
                tunjPasangan = 0.1 * gajiPokok;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                tunjPasangan = 0.1 * gajiPokok;
                tunjAnak = 0.05 * gajiPokok * anak;
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                input.close();
                return;
        }

        double gajiBersih = gajiPokok + tunjPasangan + tunjAnak;

        System.out.println("\n=== Data Karyawan ===");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp" + tunjPasangan);
        System.out.println("Tunjangan Anak: Rp" + tunjAnak);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);

        input.close();
    }
}