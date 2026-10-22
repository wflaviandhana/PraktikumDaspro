
import java.util.Scanner;

public class TiketBioskop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int hargaTiket = 50000;
        int totalPenjualan = 0;
        double diskon, totalBayar;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Ulangi input.");
                continue;
            }

            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalBayar = jumlahTiket * hargaTiket;
            totalBayar -= totalBayar * diskon;
            totalPenjualan += (int) totalBayar;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total pembayaran: Rp " + (int) totalBayar);
        }

        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);

        sc.close();
    }
}
