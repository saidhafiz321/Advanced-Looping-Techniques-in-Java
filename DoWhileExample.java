import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        String nama, alamat, loop;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Nama: ");
            nama = input.nextLine();
            System.out.print("Alamat: ");
            alamat = input.nextLine();
            System.out.println("---");
            System.out.println(nama + " tinggal di " + alamat);
            System.out.print("Ulang (y/n): ");
            loop = input.next();
            input.close();
        } while (loop.equalsIgnoreCase("Y"));

        System.out.println("Program Selesai");

    }
}
