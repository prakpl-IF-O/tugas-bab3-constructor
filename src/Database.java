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

    Database(int nik, String nama, int gajiPokok, int tunjangan, int bonus, int denda) {
        this.nik = nik;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
        this.denda = denda;
    }

}
