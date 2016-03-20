public class Database {
    private int nik;
    private long gajiPokok, tunjangan, bonus, denda;
    private String nama;
    
    public Database(){
    }
    
    public Database(int nik, String nama, long gajiPokok, long tunjangan, long bonus, long denda) {
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

    public long getGajiPokok() {
        return gajiPokok;
    }

    public long getTunjangan() {
        return tunjangan;
    }

    public long getBonus() {
        return bonus;
    }

    public long getDenda() {
        return denda;
    }

    public String getNama() {
        return nama;
    }
}
