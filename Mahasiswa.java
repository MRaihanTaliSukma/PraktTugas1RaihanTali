public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private static String universitas = "UMM";

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        // Contoh validasi NIM, bisa disesuaikan dengan kebutuhan
        if (nim.matches("[0-9]+") && nim.length() == 15) {
            this.nim = nim;
        } else {
            System.out.println("NIM tidak valid");
        }
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Method tampil data
    public void tampilDataMahasiswa() {
        System.out.println("Data Mahasiswa :");
        tampilUniversitas();
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
    }

    // Tampil univ pakai method static
    public static void tampilUniversitas() {
        System.out.println(universitas);
    }
}
