import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTiket, hargaTiket = 50000, totalTiket = 0, totalTerjual = 0;
        double totalHarga = 0;

        do {
            System.out.print("Masukkan jumlah pembelian tiket, ketik '0' untuk pembatalan: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Data yang anda masukkan tidak valid");
                continue;
            }

            totalHarga = jmlTiket * hargaTiket;

            if (jmlTiket > 10) {
                totalHarga = totalHarga * 0.85;
            } else if (jmlTiket > 4) {
                totalHarga = totalHarga * 0.9;
            } 

            System.out.println("Total harga untuk " + jmlTiket + " yang harus dibayar: Rp." + totalHarga);

            totalTiket += jmlTiket;
            totalTerjual += totalHarga;

        } while (true);
        System.out.println("Hasil Penjualan:");
        System.out.println("Jumlah tiket terjual sebanyak: " + totalTiket);
        System.out.println("Total pendapatan hari ini: Rp." + totalTerjual);
    }
}
