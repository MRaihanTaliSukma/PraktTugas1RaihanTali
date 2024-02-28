import java.util.Scanner;

public class prakTugas1RaihanTali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("==== Library System ====");
            System.out.println("1. Login Mahasiswa");
            System.out.println("2. Login Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda (1-3) : ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan NIM Anda : ");
                String Nim = scanner.next();
                if (Nim.equals("202310370311340")) {
                    System.out.println("Login Sukses !!");
                } else {
                    System.out.println("NIM tidak terdeteksi !!");
                }
            } else if (pilihan == 2) {
                System.out.print("Login Admin: ");
                String Username = scanner.next();
                System.out.print("Password: ");
                String Password = scanner.next();
                if (Username.equals("admin123") && Password.equals("admin456")) {
                    System.out.println("Login Sukses !!");
                } else {
                    System.out.println("Login Gagal !!");
                }
            } else if (pilihan == 3) {
                System.out.println("Log Out !!");
            } else {
                System.out.println("Pilihan tidak valid !!");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}