/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author dwiyan
 */
public class Pegawai {

    private String nama;
    private String nik;
    private int gajiPokok;
    private int tunjangan;
    private int bonus;
    private int denda;

    public Pegawai(String nik, String nama, int gaji, int tunjangan, int bonus, int denda) {
        this.nama = nama;
        this.nik = nik;
        this.gajiPokok = gaji;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
        this.denda = denda;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
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

    public void tampil() {
        System.out.println("================================");
        System.out.println("Nama\t\t:" + getNama());
        System.out.println("NIK\t\t:" + getNik());
        System.out.println("Gaji Pokok\t:" + getGajiPokok());
        System.out.println("Tunjangan\t:" + getTunjangan());
        System.out.println("Bonus\t\t:" + getBonus());
        System.out.println("Denda\t\t:" + getDenda());
    }

}
