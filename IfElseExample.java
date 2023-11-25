import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        // Menggunakan if-else untuk mengecek apakah angka genap atau ganjil
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah angka genap.");
        } else {
            System.out.println(angka + " adalah angka ganjil.");
        }

        // Menutup scanner
        input.close();
    }
}