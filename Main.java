import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menu() {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu :\n1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan anda: ");
            int Pilihan = scanner.nextInt();
            scanner.nextLine();
            if (Pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = scanner.nextLine();

                String nim;
                do {
                    System.out.print("Masukkan NIM Mahasiswa : ");
                    nim = scanner.nextLine();
                    if (nim.length() != 15) {
                        System.out.println("NIM harus memiliki panjang 15 digit!");
                    }
                } while (nim.length() != 15);

                System.out.print("Masukkan jurusan mahasiswa: ");
                String jurusan = scanner.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
                listMahasiswa.add(mahasiswa);

                System.out.println("Data Berhasil Ditambahkan!!");
            } else if (Pilihan == 2) {
                for (Mahasiswa mahasiswa : listMahasiswa) {
                    mahasiswa.tampilDataMahasiswa();
                }
            } else if (Pilihan == 3) {
                System.out.println("Babay");
                break;
            } else {
                System.out.println("Pilihan Apa ini!!");
            }
        }
        scanner.close(); // Close the scanner to prevent resource leak
    }

    public static void main(String[] args) {
        menu();
    }
}
