/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
/**
 *
 * @author Aditya
 */
public class Data {

    private int nik;
    private String nama;
    private int gajiPokok;
    private int tunjangan;
    private int bonus;
    private int denda;

    public Data(int n, String na, int g) {
        nik = n;
        nama = na;
        gajiPokok = g;
    }

    public Data(int t, int b, int d) {
        tunjangan = t;
        bonus = b;
        denda = d;
    }

    public void setNik(int n) {
        nik = n;
    }

    public int getNik() {
        return nik;
    }

    public void setNama(String n) {
        nama = n;
    }

    public String getNama() {
        return nama;
    }

    public void setGaji(int g) {
        gajiPokok = g;
    }

    public int getGaji() {
        return gajiPokok;
    }

    public void setTunjangan(int t) {
        tunjangan = t;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setBonus(int b) {
        bonus = b;
    }

    public int getBonus() {
        return bonus;
    }

    public void setDenda(int d) {
        denda = d;
    }

    public int getDenda() {
        return denda;
    }
}
