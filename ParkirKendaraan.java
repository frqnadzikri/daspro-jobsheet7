import java.util.Scanner;

public class ParkirKendaraan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis;      // 1 = mobil, 2 = motor, 0 = keluar
        int durasi;
        int total = 0;  // total pembayaran semua kendaraan

        do {
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = input.nextInt();

            // Jika bukan 1, 2, atau 0, abaikan input
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500; // tarif tetap jika lebih dari 5 jam
                } else if (jenis == 1) {
                    total += durasi * 3000; // mobil
                } else if (jenis == 2) {
                    total += durasi * 2000; // motor
                }

            } else if (jenis != 0) {
                System.out.println("Input tidak valid! Silakan masukkan 1, 2, atau 0.");
            }

        } while (jenis != 0); // berhenti jika input 0

        System.out.println("\nTotal pembayaran parkir hari ini: Rp " + total);

        input.close();
    }
}

