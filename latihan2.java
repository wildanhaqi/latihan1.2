import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teks = "";
        String[] kata = null;

        boolean exit = false;
        while (!exit) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1/2/3/4/5): ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    input.nextLine(); // Clear the newline character
                    System.out.print("Silakan masukkan teks: ");
                    teks = input.nextLine();
                    break;
                case 2:
                    int jumlahKarakter = teks.length();
                    System.out.println("Jumlah karakter: " + jumlahKarakter);
                    break;
                case 3:
                    kata = teks.split("\\s+");
                    int jumlahKata = kata.length;
                    System.out.println("Jumlah kata: " + jumlahKata);
                    break;
                case 4:
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String kataCari = input.next();
                    int jumlahKemunculan = 0;
                    for (String kataTeks : kata) {
                        if (kataTeks.equalsIgnoreCase(kataCari)) {
                            jumlahKemunculan++;
                        }
                    }
                    System.out.println("Jumlah kemunculan kata \"" + kataCari + "\": " + jumlahKemunculan);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan Text Analyzer!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            System.out.println();
        }

        input.close();
    }
}