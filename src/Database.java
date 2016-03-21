public class Database {
    private int nik, gajiPokok, tunjangan, bonus, denda;
    private String nama;
    
    public Database(){
    }
    
    public Database(int nik, String nama, int gajiPokok, int tunjangan, int bonus, int denda) {
        this.nik = nik;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
        this.denda = denda;
        this.nama = nama;
    }

    public int getNik() {
        return nik;
    }

    public int getGajiPokok() {
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

    public String getNama() {
        return nama;
    }
}
