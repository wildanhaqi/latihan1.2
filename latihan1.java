import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator!");
        System.out.println("Silakan pilih operasi yang ingin Anda lakukan:");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Masukkan angka: ");
            double num = input.nextDouble();
            double result = Math.sqrt(num);
            System.out.println("Hasil akar kuadrat dari " + num + " adalah " + result);
        } else if (choice == 2) {
            System.out.print("Masukkan angka: ");
            double base = input.nextDouble();
            System.out.print("Masukkan pangkat: ");
            double exponent = input.nextDouble();
            double result = Math.pow(base, exponent);
            System.out.println(base + " pangkat " + exponent + " adalah " + result);
        } else if (choice == 3) {
            System.out.print("Masukkan angka: ");
            double num = input.nextDouble();
            double result = Math.log(num);
            System.out.println("Logaritma natural dari " + num + " adalah " + result);
        } else if (choice == 4) {
            System.out.print("Masukkan angka: ");
            int num = input.nextInt();
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            System.out.println("Faktorial dari " + num + " adalah " + result);
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        input.close();
    }
}