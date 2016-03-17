
public class Data {

    private int nik;
    private String nama;
    private int gajiPokok;
    private int tunjangan;
    private int bonus;
    private int denda;

    public Data() {

    }

    public Data(int n, String na, int g, int t, int b, int d) {
        nik = n;
        nama = na;
        gajiPokok = g;
        tunjangan = t;
        bonus = b;
        denda = d;
    }

    public void setNik(int n) {
        nik = n;
    }

    public void setNama(String n) {
        nama = n;
    }

    public void setGaji(int g) {
        gajiPokok = g;
    }

    public void setTunjangan(int t) {
        tunjangan = t;
    }

    public void setBonus(int b) {
        bonus = b;
    }

    public void setDenda(int d) {
        denda = d;
    }

    public int getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gajiPokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getBonus() {
        return bonus;
    }

    public int getDenda() {
        return denda;
    }
}
