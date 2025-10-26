import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (y/n): ");
        char member = input.next().charAt(0);
        System.out.print("Masukkan total belanja: ");
        double belanja = input.nextDouble();
        System.out.print("Masukkan uang yang dibayarkan: ");
        double bayar = input.nextDouble();

        double diskon = 0;

        if (member == 'y' || member == 'Y') {
            if (belanja > 500000) {
                diskon = 50000;
            } else if (belanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (belanja > 100000) {
                diskon = 10000;
            }
        }

        double totalBayar = belanja - diskon;
        double kembalian = bayar - totalBayar;

        System.out.println("\n=== Struk Belanja ===");
        System.out.println("Total Belanja : Rp" + belanja);
        System.out.println("Diskon        : Rp" + diskon);
        System.out.println("Total Bayar   : Rp" + totalBayar);
        System.out.println("Kembalian     : Rp" + kembalian);

        input.close();
    }
}