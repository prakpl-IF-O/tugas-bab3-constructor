public class Pegawai {
    private Integer nik;
    private String nama;
    private Double gajiPokok, tunjangan, bonus, denda;

    public Pegawai(Integer nik, String nama, Double gajiPokok, Double tunjangan, Double bonus, Double denda) {
        this.nik = nik;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
        this.denda = denda;
    }

    public Integer getNik() {
        return nik;
    }

    public void setNik(Integer nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(Double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public Double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(Double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getDenda() {
        return denda;
    }

    public void setDenda(Double denda) {
        this.denda = denda;
    }

//    @Override
//    public String toString() {
//        return "{\n" + "\tnik=" + nik + ",\n\tnama=" + nama + ",\n\tgajiPokok=" + gajiPokok + ",\n\ttunjangan=" + tunjangan + ",\n\tbonus=" + bonus + ",\n\tdenda=" + denda + "\n}\n";
//                
//    }

    @Override
    public String toString() {
        return "{" + "nik=" + nik + ", nama=" + nama + ", gajiPokok=" + gajiPokok + ", tunjangan=" + tunjangan + ", bonus=" + bonus + ", denda=" + denda + '}';
    }
    
    
}
