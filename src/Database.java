/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//"nik":101,
//      "nama":"Paijo",
//      "gajiPokok":2000,
//      "tunjangan":1000,
//      "bonus":500,
//      "denda":200

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
