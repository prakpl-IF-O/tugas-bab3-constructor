/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_3;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Zyref
 */
public class Tugas_3 {

    private int nik, gajiPokok, tunjangan, bonus, denda;
    private String nama;

    public Tugas_3(int nik, String nama, int gajiPokok, int tunjangan, int bonus, int denda) {
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

    public void setNik(int nik) {
        this.nik = nik;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
