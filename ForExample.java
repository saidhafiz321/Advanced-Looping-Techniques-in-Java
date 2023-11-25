import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        // Menggunakan for untuk mencetak barisan angka dari 1 hingga angka yang dimasukkan
        System.out.println("Mencetak barisan angka dari 1 hingga " + angka + ":");
        for (int i = 1; i <= angka; i++) {
            System.out.print(i + " ");
        }

        // Menutup scanner
        input.close();
    }
}