import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total penjualan: ");
        double penjualan = input.nextDouble();

        double jasa, komisi;

        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            jasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            jasa = 300000;
            komisi = 0.20 * penjualan;
        }

        double totalPendapatan = jasa + komisi;
        System.out.println("Total pendapatan salesman: Rp" + totalPendapatan);

        input.close();
    }
}