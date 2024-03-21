public class app {
    public static void main(String[] args) {
        tabung tabung = new tabung();
        kubus kubus = new kubus();
        balok balok = new balok();


        tabung.setName("tabung");
        kubus.setName("kubus");
        balok.setName("balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}