package Tugas2GitHub;
public class SimpanGaji {
   private String nama;
   private int nik,gajiPokok,tunjangan,bonus,denda;

    public SimpanGaji(String nama, int nik, int gajiPokok, int tunjangan, int bonus, int denda) {
        this.nama = nama;
        this.nik = nik;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
        this.denda = denda;
    }

    public String getNama() {
        return nama;
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
}
