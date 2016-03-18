
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy Wiranto
 */
public class dataBase {

    private int nik;
    private String nama;
    private int gajiPokok;
    private int tunjangan;
    private int bonus;
    private int denda;

    public dataBase(int nk, String nm, int gp, int tj, int b, int d) {
        nik = nk;
        nama = nm;
        gajiPokok = gp;
        tunjangan = tj;
        bonus = b;
        denda = d;
    
    }

    public void setNik(int nk) {
        nik = nk;
    }

    public void setNama(String nm) {
        nama = nm;
    }

    public void setGaji(int gp) {
        gajiPokok = gp;
    }

    public void setTunjangan(int tj) {
        tunjangan = tj;
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

