/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gunka
 */
public class Database {

    String nama;
    int nik, gajiPokok, tunjangan, bonus, denda;
    String nama1;
    int nik1, gajiPokok1, tunjangan1, bonus1, denda1;

    Database(int nik, String nama, int gajiPokok, int tunjangan, int bonus, int denda) {
        this.nik = nik;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
        this.denda = denda;
    }

    public void setNama(String nama) {
        this.nama1 = nama;
    }

    public void setNik(int nik) {
        this.nik1 = nik;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok1 = gajiPokok;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan1 = tunjangan;
    }

    public void setBonus(int bonus) {
        this.bonus1 = bonus;
    }

    public void setDenda(int denda) {
        this.denda1 = denda;
    }

    

}
